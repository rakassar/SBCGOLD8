package BUSINESSNEXT.SBCGOLD8.SOAPAPI;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EKYC_createCustomer_Account {
	String leadid ;
	String BBN = ""; // BBN for ETB Scenario else leave blank
	String accountID = "";   
	String EQBN = "";
	String isBbnRequired = "Yes";
	String leadIdType = "NTB";  //NTB, ETB
	
	
	public void EtbAccountOpen(String leadID , String BBN ,String accountId) throws IOException {
		this.BBN = BBN;
		this.leadIdType = "ETB";
		this.accountID = accountId;
		accountOpen(leadID);
		
	}

	public  void accountOpen(String leadID) throws IOException {
		
		leadid = leadID;
		
		String url = "https://sbcdev.crmnext.com/accg7/CRMnextWebApi/CRMnextService.svc?wsdl";
        String xml= "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:api=\"http://www.crmnext.com/api/\" xmlns:arr=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"> <soapenv:Header/> <soapenv:Body> <api:SaveObject> <api:userContext> <api:Token>"
        		+ TokenGeneration.Token
        		+ "</api:Token> </api:userContext> <api:objectInfo> <api:SaveRequest> <api:ItemId>"
        		+ leadid
        		+ "</api:ItemId> <api:ItemType>Lead</api:ItemType> <api:ObjectData> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_38</arr:Key> <arr:Value>"
        		+ BBN
        		+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>EXISTINGACCOUNTID</arr:Key> <arr:Value>"
        		+ accountID
        		+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_44</arr:Key> <arr:Value>"
        		+ EQBN
        		+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_117</arr:Key> <arr:Value>"
        		+ isBbnRequired
        		+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_135</arr:Key> <arr:Value>BM</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_30</arr:Key> <arr:Value>Approved</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>MOBILEPHONE</arr:Key> <arr:Value>09876543219</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>FIRSTNAME</arr:Key> <arr:Value>Name</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>MIDDLENAME</arr:Key> <arr:Value>Mid</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LASTNAME</arr:Key> <arr:Value>Title</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>GENDERID</arr:Key> <arr:Value>M</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_17</arr:Key> <arr:Value>1</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_41</arr:Key> <arr:Value>12/24/1994</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_2</arr:Key> <arr:Value>Almora</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_32</arr:Key> <arr:Value>19876543</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>PHONE</arr:Key> <arr:Value>1567887654</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_59</arr:Key> <arr:Value>HNO</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LOCALITY</arr:Key> <arr:Value>LOCAL</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_139</arr:Key> <arr:Value>PHILIPPINES</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>STATE</arr:Key> <arr:Value>Cagayan Valley</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>DISTRICT</arr:Key> <arr:Value>METRO MANILA</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>CITY</arr:Key> <arr:Value>Ermita</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>ZIPCODE</arr:Key> <arr:Value>1440</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX2_169</arr:Key> <arr:Value>678876</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_184</arr:Key> <arr:Value>PRES</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_11</arr:Key> <arr:Value>OK</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_8</arr:Key> <arr:Value>10</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_135</arr:Key> <arr:Value>CULTURAL EDUCATION</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>TERRITORYID</arr:Key> <arr:Value>49</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>PRODUCTID</arr:Key> <arr:Value>EB</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_1</arr:Key> <arr:Value>INDIVIDUAL</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_4</arr:Key> <arr:Value>INDIVIDUAL</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_76</arr:Key> <arr:Value>OW</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_117</arr:Key> <arr:Value>Blue</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_125</arr:Key> <arr:Value>160</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_113</arr:Key> <arr:Value>0</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_16</arr:Key> <arr:Value>PH</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_26</arr:Key> <arr:Value>R</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_79</arr:Key> <arr:Value>Philippines</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_96</arr:Key> <arr:Value>PHP</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_82</arr:Key> <arr:Value>"
        		+ leadIdType
        		+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>StatusCodeId</arr:Key> <arr:Value>100022</arr:Value> </arr:KeyValueOfstringstring> </api:ObjectData> <api:OutputFieldList> <arr:string>LeadId</arr:string> <arr:string>StatusCode</arr:string> <arr:string>LEA_EX3_179</arr:string> <arr:string>LEA_EX1_149</arr:string> <arr:string>LEA_EX3_174</arr:string> <arr:string>LEA_EX1_152</arr:string> <arr:string>LEA_EX1_156</arr:string> </api:OutputFieldList> <api:ProcessMode>Update</api:ProcessMode> </api:SaveRequest> </api:objectInfo> </api:SaveObject> </soapenv:Body> </soapenv:Envelope> ";
		
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
		System.out.println("\ncreate account API response:" + response.toString());
		String[] leadid2 = response.toString().split("<ItemKey>");
		String[] leadid1 = leadid2[1].split("</ItemKey>");
		 leadid = leadid1[0];
			String[] message = response.toString().split("<Message>");
			String[] message1 = message[1].split("</Message>");
			System.out.println("\n \nMessage: " + message1[0]);
		    System.out.println("\n \nLead id: " + leadid);

		

	
		
	}

}
