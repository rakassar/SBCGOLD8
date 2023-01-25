package BUSINESSNEXT.SBCGOLD8.SOAPAPI;

public class ApiMainClass {

	
	public static void main(String args[])
	
	{
		TokenGeneration token=new TokenGeneration();
		CSQUpdateForTrustTreasury CSQ=new CSQUpdateForTrustTreasury();
		
		token.Token();
		CSQ.CSQUpdate();
		
		
	}
	}
