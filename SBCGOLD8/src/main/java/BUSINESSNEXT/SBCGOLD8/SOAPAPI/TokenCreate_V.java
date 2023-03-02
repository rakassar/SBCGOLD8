package BUSINESSNEXT.SBCGOLD8.SOAPAPI;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import BUSINESSNEXT.SBCGOLD8.REPOSITORY.Properties;

public class TokenCreate_V {

	public static void main(String[] args) throws IOException {

		generateToken();
	}

	public static String generateToken() throws IOException {

		String finalToken = "";
		String url = Properties.WSDLUrl;
		String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:api=\"http://www.crmnext.com/api/\"><soapenv:Header/><soapenv:Body><api:Login><api:login>admin</api:login><api:password>acid_qa</api:password></api:Login></soapenv:Body></soapenv:Envelope>";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "text/xml");
		con.setRequestProperty("SOAPAction", "http://www.crmnext.com/api/ICRMnextApi/Login");
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(xml);
		wr.flush();
		wr.close();
		String responseStatus = con.getResponseMessage();
		//System.out.println(responseStatus);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		System.out.println("login api response:" + response.toString());
		String[] token = response.toString().split("<Token>");
		String[] token1 = token[1].split("</Token>");
		finalToken = token1[0];

		System.out.println("\nTOken: " + finalToken);

		return finalToken;

	}
}
