package BUSINESSNEXT.SBCGOLD8.SOAPAPI;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EKYC_updateLead {

	public static void updateLeadStatus(String leadID) throws IOException {
		
		String leadid =leadID; //to input lead manually
		String statusCode = "100031"; //100013 = Rejected, 100031 = Document collection
		String risk = "No Hit";   //No Hit  , Prohibited , High
		
		
		String url = "https://sbcdev.crmnext.com/accg7/CRMnextWebApi/CRMnextService.svc?wsdl";
        String xml= "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:api=\"http://www.crmnext.com/api/\" xmlns:arr=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"> <soapenv:Header/> <soapenv:Body> <api:SaveObject> <api:userContext> <api:Token>"
        		+ TokenGeneration.Token
        		+"</api:Token> </api:userContext> <api:objectInfo> <api:SaveRequest> <api:ItemId>"
        		+ leadid
        		+ "</api:ItemId> <api:ItemType>Lead</api:ItemType> <api:ObjectData> <arr:KeyValueOfstringstring> <arr:Key>STATUSCODE</arr:Key> <arr:Value>"
        		+ statusCode
        		+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_154</arr:Key> <arr:Value>"
        		+ risk
        		+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_30</arr:Key> <arr:Value>"
        		+ "Remarks"
        		+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_135</arr:Key> <arr:Value>BM</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>ActionInitiatedType</arr:Key> <arr:Value>1</arr:Value> </arr:KeyValueOfstringstring> </api:ObjectData> <api:OutputFieldList> <arr:string>LeadId</arr:string> </api:OutputFieldList> <api:ProcessMode>Update</api:ProcessMode> </api:SaveRequest> </api:objectInfo> </api:SaveObject> </soapenv:Body> </soapenv:Envelope>";
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
