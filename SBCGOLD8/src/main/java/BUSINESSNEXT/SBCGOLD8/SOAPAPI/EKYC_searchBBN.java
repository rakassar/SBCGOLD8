package BUSINESSNEXT.SBCGOLD8.SOAPAPI;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EKYC_searchBBN {

	public static void main(String[] args) throws IOException {
		
		String mobilePhone ="";
		String EAN="";
		String tinNumber ="";
		String BBN ="51292000149";
		String eMail="";
		String token = new TokenCreate_V().generateToken();
		
		String url = "https://sbcdev.crmnext.com/accg7/CRMnextWebApi/CRMnextService.svc?wsdl";
        String xml= "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:api=\"http://www.crmnext.com/api/\"> <soapenv:Header/> <soapenv:Body> <api:GetEDSJsonResult> <api:userContext> <api:Token>"
        		+ token
        		+ "</api:Token> </api:userContext> <api:sourceId>5310</api:sourceId> <api:parameters> <api:CRMStringPair> <api:First>V_MOBILEPHONE</api:First>"
        		+ mobilePhone
        		+ "<api:Second></api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_EAN</api:First> <api:Second>"
        		+ EAN
        		+ "</api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_TINNUMBER</api:First> <api:Second>"
        		+ tinNumber
        		+ "</api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_PIDTYPE</api:First> <api:Second></api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_IDNUMBER</api:First> <api:Second></api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_EMAIL</api:First> <api:Second>"
        		+ eMail
        		+ "</api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_SECIDTYPE</api:First> <api:Second></api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_SECID</api:First> <api:Second></api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_BBN</api:First> <api:Second>"
        		+ BBN
        		+ "</api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_FIRSTNAME</api:First> <api:Second></api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_MIDDLENAME</api:First> <api:Second></api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_LASTNAME</api:First> <api:Second></api:Second> </api:CRMStringPair> <api:CRMStringPair> <api:First>V_DATEOFBIRTH</api:First> <api:Second>20/01/2021</api:Second> </api:CRMStringPair> </api:parameters> </api:GetEDSJsonResult> </soapenv:Body> </soapenv:Envelope>";		
        URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "text/xml");
		con.setRequestProperty("SOAPAction", "http://www.crmnext.com/api/ICRMnextApi/GetEDSJsonResult");
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(xml);
		wr.flush();
		wr.close();
		String responseStatus = con.getResponseMessage();
		// System.out.println(responseStatus);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		System.out.println("\nSearch API response:" + response.toString());
		String[] leadid2 = response.toString().split("<DataResultJson>");
		String[] leadid1 = leadid2[1].split("</DataResultJson>");
		 String info = leadid1[0];
			System.out.println("\n \ninfo: " + info);

		

	
		
	}

}
