package BUSINESSNEXT.SBCGOLD8.SOAPAPI;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EKYC_InquireLeadStatus {

	public static void main(String[] args) throws IOException {
		enquireLeadStatus("24");
	}
	
	public static void enquireLeadStatus(String LeadID) throws IOException {
		
		String leadid = "13873";//LeadID; 
		
		
		String url = "https://sbcdev.crmnext.com/accg7/CRMnextWebApi/CRMnextService.svc?wsdl";
        String xml= "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:api=\"http://www.crmnext.com/api/\" xmlns:arr=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"> <soapenv:Header/> <soapenv:Body> <api:FetchObject> <api:userContext> <api:Token>"
        		+ TokenGeneration.Token
        		+ "</api:Token> </api:userContext> <api:saveRequest> <api:ItemId>"
        		+ leadid
        		+ "</api:ItemId> <api:ItemType>Lead</api:ItemType> <api:OutputFieldList> <arr:string>LeadId</arr:string> <arr:string>StatusCode</arr:string> <arr:string>LEA_EX1_38</arr:string> <arr:string>LEA_EX1_44</arr:string> <arr:string>LEA_EX3_32</arr:string> <arr:string>LEA_EX3_165</arr:string> <arr:string>LEA_EX3_1</arr:string> <arr:string>LEA_EX3_118</arr:string> <arr:string>LEA_EX3_164</arr:string> <arr:string>LEA_EX3_166</arr:string> <arr:string>LEA_EX3_167</arr:string> <arr:string>LEA_EX3_163</arr:string> </api:OutputFieldList> </api:saveRequest> </api:FetchObject> </soapenv:Body> </soapenv:Envelope>"; 
		
        URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "text/xml");
		con.setRequestProperty("SOAPAction", "http://www.crmnext.com/api/ICRMnextApi/FetchObject");
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
		System.out.println("\nEnquire lead API response:" + response.toString());
		
			String[] message = response.toString().split("<a:Value i:type=\"b:string\" xmlns:b=\"http://www.w3.org/2001/XMLSchema\">");
			String[] message1 = message[1].split("</a:Value>");
			System.out.println("\n \nLead status code : " + message1[0]);
		    

		

	
		
	}

}
