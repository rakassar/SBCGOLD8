package BUSINESSNEXT.SBCGOLD8.SOAPAPI;



import java.io.ByteArrayInputStream;
import java.io.File;

import javax.naming.InitialContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;

import org.apache.axis.utils.ByteArrayOutputStream;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;




public class TokenGeneration {
public static String Token;
    // SAAJ - SOAP Client Testing
    //public static void main(String args[]) {
public static void Token() {
        /*
            The example below requests from the Web Service at:
             http://www.webservicex.net/uszip.asmx?op=GetInfoByCity


            To call other WS, change the parameters below, which are:
             - the SOAP Endpoint URL (that is, where the service is responding from)
             - the SOAP Action

            Also change the contents of the method createSoapEnvelope() in this class. It constructs
             the inner part of the SOAP envelope that is actually sent.
         */
        String soapEndpointUrl = "https://sbcdev.crmnext.com/accg7/CRMnextWebApi/CRMnextService.svc";
        String soapAction = "http://www.crmnext.com/api/ICRMnextApi/Login";
       
        callSoapWebService(soapEndpointUrl, soapAction);
    }

    private static void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String myNamespace = "api";
        String myNamespaceURI = "http://www.crmnext.com/api/";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("Login", myNamespace);
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("login", myNamespace);
        soapBodyElem1.addTextNode("webserviceuser");
        SOAPElement soapBodyElem4 = soapBodyElem.addChildElement("password", myNamespace);
        soapBodyElem4.addTextNode("acid_qa");

        
    }

    private static void callSoapWebService(String soapEndpointUrl, String soapAction) {
        
    	try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);
            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            String Response =soapResponse.toString();
            System.out.println(Response);
            
            //soapResponse.writeTo(System.out);
            //System.out.println();
            
           // soapResponse.getSOAPBody();
            //soapResponse.getSOAPPart();
      
            ByteArrayOutputStream byteOutStream = new ByteArrayOutputStream();
            soapResponse.writeTo(byteOutStream);
            String res = new String(byteOutStream.toByteArray());
            //System.out.println("Response \n"+res);
 
            
            
            
            
            
            
            
            File xmlFile = new File(res);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            ByteArrayInputStream bis = new ByteArrayInputStream(res.getBytes());
            Document doc = dBuilder.parse(bis);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Token");
             Token = nList.item(0).getChildNodes().item(0).getTextContent();
            
            System.out.println("Token-"+Token);
            
			/*
			 * nList = doc.getElementsByTagName("FamilyAnnualOOPLimitAmount"); String
			 * familyAnnualAmount = nList.item(0).getChildNodes().item(0).getTextContent();
			 */
            
            
            
            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }

    private static SOAPMessage createSOAPRequest(String soapAction) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        createSoapEnvelope(soapMessage);
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);
        headers.addHeader("Content-Type", "text/xml; charset=utf-8");
        soapMessage.saveChanges();
        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");
        return soapMessage;
    }

}