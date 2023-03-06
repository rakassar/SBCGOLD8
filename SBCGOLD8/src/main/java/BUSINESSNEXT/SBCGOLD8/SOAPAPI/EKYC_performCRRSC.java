package BUSINESSNEXT.SBCGOLD8.SOAPAPI;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EKYC_performCRRSC {

	public static void performCRRSC(String leadId) throws IOException {
		
		String leadid =leadId; 
		
		
		String url = "https://sbcdev.crmnext.com/accg7/CRMnextWebApi/CRMnextService.svc?wsdl";
        String xml="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:api=\"http://www.crmnext.com/api/\" xmlns:arr=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"> <soapenv:Header/> <soapenv:Body> <api:SaveObject> <api:userContext> <api:Token>"
        		+ TokenGeneration.Token
        		+ "</api:Token> </api:userContext> <api:objectInfo> <api:SaveRequest> <api:ItemId>"
        		+ leadid
        		+ "</api:ItemId> <api:ItemType>Lead</api:ItemType> <api:ObjectData> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_1</arr:Key> <arr:Value>No</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_141</arr:Key> <arr:Value>No</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_4</arr:Key> <arr:Value></arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_142</arr:Key> <arr:Value></arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_85</arr:Key> <arr:Value></arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_5</arr:Key> <arr:Value></arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_24</arr:Key> <arr:Value></arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX2_40</arr:Key> <arr:Value>7</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_143</arr:Key> <arr:Value>No</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_144</arr:Key> <arr:Value>No</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_154</arr:Key> <arr:Value>No Hit</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>STATUSCODEID</arr:Key> <arr:Value>100031</arr:Value> </arr:KeyValueOfstringstring> </api:ObjectData> <api:OutputFieldList> <arr:string>LEA_EX1_33</arr:string> <arr:string>LEA_EX1_155</arr:string> </api:OutputFieldList> <api:ProcessMode>Update</api:ProcessMode> </api:SaveRequest> </api:objectInfo> </api:SaveObject> </soapenv:Body> </soapenv:Envelope> ";
        		
        URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "text/xml");
		con.setRequestProperty("SOAPAction", "http://www.crmnext.com/api/ICRMnextApi/SaveObject");
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
		System.out.println("\nUpdate lead API response:" + response.toString());
		String[] leadid2 = response.toString().split("<ItemKey>");
		String[] leadid1 = leadid2[1].split("</ItemKey>");
		 leadid = leadid1[0];
			String[] message = response.toString().split("<Message>");
			String[] message1 = message[1].split("</Message>");
			System.out.println("\n \nMessage: " + message1[0]);
		    System.out.println("\n \nLead id: " + leadid);

		

	
		
	}

}
