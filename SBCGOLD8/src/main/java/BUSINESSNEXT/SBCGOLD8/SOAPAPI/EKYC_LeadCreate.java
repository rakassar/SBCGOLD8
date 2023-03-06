package BUSINESSNEXT.SBCGOLD8.SOAPAPI;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import BUSINESSNEXT.SBCGOLD8.*;

import BUSINESSNEXT.SBCGOLD8.METHOD.LeadObjectPageMethod;

public class EKYC_LeadCreate {
	public static String firstName;
	public static String lastName;
	public static String MOBILEPHONE;
	public static String EMAIL;
	public static String IdNumber;
	

	public static void main(String[] args) throws IOException {
	
		createLead();
	}
		
		public  static String createLead() throws IOException  {
		
		MOBILEPHONE = "09876545672";
		EMAIL = "hello@gmail.com";
		IdNumber = "6768";
		firstName = "bishal";
		lastName = "Singh";

		TokenGeneration.Token = TokenCreate_V.generateToken();
		String url = "https://sbcdev.crmnext.com/accg7/CRMnextWebApi/CRMnextService.svc?wsdl";
		String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:api=\"http://www.crmnext.com/api/\" xmlns:arr=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"> <soapenv:Header/> <soapenv:Body> <api:SaveObject> <api:userContext> <api:Token>"
				+ TokenGeneration.Token
				+ "</api:Token></api:userContext> <api:objectInfo> <api:SaveRequest> <api:ItemType>Lead</api:ItemType> <api:ObjectData> <arr:KeyValueOfstringstring> <arr:Key>MOBILEPHONE</arr:Key> <arr:Value>"
				+ MOBILEPHONE
				+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>EMAIL</arr:Key> <arr:Value>"
				+ EMAIL
				+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_43</arr:Key> <arr:Value>US</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_22</arr:Key> <arr:Value>xfsdfs</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX2_81</arr:Key> <arr:Value>Yes</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX2_80</arr:Key> <arr:Value>Yes</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX2_82</arr:Key> <arr:Value>Certificate of Loss of US Nationality</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_80</arr:Key> <arr:Value>2345678765</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_35</arr:Key> <arr:Value/> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_48</arr:Key> <arr:Value>Drivdser's License</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_51</arr:Key> <arr:Value>"
				+ IdNumber
				+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>FIRSTNAME</arr:Key> <arr:Value>"
				+ firstName
				+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>MIDDLENAME</arr:Key> <arr:Value>Mid</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LASTNAME</arr:Key> <arr:Value>"
				+ lastName
				+ "</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>SUFFIXID</arr:Key> <arr:Value>SUFFIX2</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>GENDERID</arr:Key> <arr:Value>F</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_17</arr:Key> <arr:Value>1</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_41</arr:Key> <arr:Value>12/24/1994</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_2</arr:Key> <arr:Value>Almora</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_32</arr:Key> <arr:Value>aaaa</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>PHONE</arr:Key> <arr:Value>111</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_27</arr:Key> <arr:Value>Mother</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_59</arr:Key> <arr:Value>HNO</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LOCALITY</arr:Key> <arr:Value>LOCAL</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_139</arr:Key> <arr:Value>PHILIPPINES</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>STATE</arr:Key> <arr:Value>Cagayan Valley</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>DISTRICT</arr:Key> <arr:Value>METRO MANILA</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>CITY</arr:Key> <arr:Value>Ermita</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>ZIPCODE</arr:Key> <arr:Value>1440</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_58</arr:Key> <arr:Value>HNO</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_23</arr:Key> <arr:Value>LOCAL</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_140</arr:Key> <arr:Value>Philippines</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_19</arr:Key> <arr:Value>National Capital Region</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_20</arr:Key> <arr:Value>METRO MANILA</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_21</arr:Key> <arr:Value>Ermita</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_22</arr:Key> <arr:Value>1000</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_141</arr:Key> <arr:Value>Algeria</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_60</arr:Key> <arr:Value>FLOOR</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_57</arr:Key> <arr:Value>STREET</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_53</arr:Key> <arr:Value>National Capital Region</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_54</arr:Key> <arr:Value>METRO MANILA</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_55</arr:Key> <arr:Value>Ermita</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_56</arr:Key> <arr:Value>456764</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_199</arr:Key> <arr:Value>345543</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_190</arr:Key> <arr:Value>456654</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX2_168</arr:Key> <arr:Value>567765</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX2_169</arr:Key> <arr:Value>678876</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_184</arr:Key> <arr:Value>PRES</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_14</arr:Key> <arr:Value>2</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_12</arr:Key> <arr:Value>Others</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_121</arr:Key> <arr:Value>305k to 470k</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_3</arr:Key> <arr:Value>EMPLOYERNAME</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_72</arr:Key> <arr:Value>11</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_11</arr:Key> <arr:Value>OK</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX2_37</arr:Key> <arr:Value>BUSINESSNAME</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_8</arr:Key> <arr:Value>10</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_134</arr:Key> <arr:Value>Education</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_135</arr:Key> <arr:Value>CULTURAL EDUCATION</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_91</arr:Key> <arr:Value>PH</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_136</arr:Key> <arr:Value>Education</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_137</arr:Key> <arr:Value>OTHER EDUCATION, N.E.C.</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_178</arr:Key> <arr:Value/> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_179</arr:Key> <arr:Value>BI</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>TERRITORYID</arr:Key> <arr:Value>49</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>PRODUCTID</arr:Key> <arr:Value>EB</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_1</arr:Key> <arr:Value>INDIVIDUAL</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_4</arr:Key> <arr:Value>INDIVIDUAL</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_76</arr:Key> <arr:Value>OW</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_116</arr:Key> <arr:Value>RBS</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_117</arr:Key> <arr:Value>Blue</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_46</arr:Key> <arr:Value>ZZZ-FOR RE-TAGGING</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_125</arr:Key> <arr:Value>160</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_113</arr:Key> <arr:Value>0</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEADSOURCEID</arr:Key> <arr:Value>19</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_16</arr:Key> <arr:Value>PH</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_26</arr:Key> <arr:Value>R</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_5</arr:Key> <arr:Value>Y</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX5_31</arr:Key> <arr:Value>N</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_48</arr:Key> <arr:Value>1</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_79</arr:Key> <arr:Value>Philippines</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_96</arr:Key> <arr:Value></arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX2_26</arr:Key> <arr:Value>02/25/2010</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_29</arr:Key> <arr:Value>othersource</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX1_30</arr:Key> <arr:Value>otheroccupation</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LEA_EX3_82</arr:Key> <arr:Value>NTB</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>LayoutId</arr:Key> <arr:Value>200197</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>RatingId</arr:Key> <arr:Value>1</arr:Value> </arr:KeyValueOfstringstring> <arr:KeyValueOfstringstring> <arr:Key>StatusCodeId</arr:Key> <arr:Value>100008</arr:Value> </arr:KeyValueOfstringstring> </api:ObjectData> <api:OutputFieldList> <!--Zero or more repetitions:--> <arr:string>StatusCode</arr:string> <arr:string>LeadId</arr:string> <arr:string>CREATEDON</arr:string> </api:OutputFieldList> <api:ProcessMode>Create</api:ProcessMode> </api:SaveRequest> </api:objectInfo> </api:SaveObject> </soapenv:Body> </soapenv:Envelope>";

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
		System.out.println("\nCreate lead API response:" + response.toString());
		String[] leadid2 = response.toString().split("<ItemKey>");
		String[] leadid1 = leadid2[1].split("</ItemKey>");
		 String leadid = leadid1[0];
		 
		if (leadid.equals("-1")) {
			String[] message = response.toString().split("<Message>");
			String[] message1 = message[1].split("</Message>");
			System.out.println("\n \nError message: " + message1[0]);

		} else {
			System.out.println("\n \nLead id: " + leadid);

		}
		LeadObjectPageMethod.leadid = leadid;
		return leadid;

	}
}



