
public class CryptoManager {

	private static final char LOWER_BOUND = ' ';	
	
	private static final char UPPER_BOUND = '_';
	
	private static final int RANGE = (UPPER_BOUND - LOWER_BOUND + 1);

	 
		public static boolean stringInBounds (String plainText)
		{
			
			boolean inBounds = true;

			for (int i = 0; i < plainText.length(); i++)
			{
				char letter = plainText.charAt(i);		
				
				if (letter < LOWER_BOUND || letter > UPPER_BOUND)
				{
					inBounds = false;
				}
			}
			
			return inBounds;
		}

		 
		public static String encryptCaesar(String plainText, int key)
		{
			if (!stringInBounds(plainText)) 
			{
				return "";
			} 
			
			String encryptedString = ""; //Cause we need to build a new string letter by letter, so 
			                             //It's like adding numbers to "0"

			for (int i = 0; i < plainText.length(); i++)
			{
				
				char letter = plainText.charAt(i); 
				
				int encryptedLetter = (int)letter + key;

				while (encryptedLetter > UPPER_BOUND)
				{
					encryptedLetter -= RANGE; 
				
				}

				encryptedString += (char) encryptedLetter;//Adds letter to empty string making an "Encrypted" one
			}

			return encryptedString;
		}
	
		

		
		public static String decryptCaesar(String encryptedText, int key) {
			
			String decryptedString = "";
			
			key%=RANGE;
			
			int stringLength = encryptedText.length();
			
			for (int i = 0; i < stringLength; i++)
			{
				int letter = (char)(encryptedText.charAt(i) - key);//JUnit test was not working unless I formatted it like this
			
				while (letter < LOWER_BOUND) 
				{
					letter+=RANGE;
				}
				
				decryptedString +=(char)letter;//Adds letter to empty string making an "decrypted" one

			}




			return decryptedString;
		}
		
		
		 
		public static String encryptBellaso(String plainText, String bellasoStr) {
			
			
			String encryptedString = "";//Cause we need to build a new string letter by letter, so 
										//It's like adding numbers to "0"

			
			int belassoLength = bellasoStr.length();
			
			
			int upperBound = (int) UPPER_BOUND; 


			for (int i = 0; i < plainText.length(); i++)
			{
				
				char letter = plainText.charAt(i);
				
				int encryptedLetter = (int)letter + (int)bellasoStr.charAt(i % belassoLength);


				while (encryptedLetter > upperBound) 
				{
					encryptedLetter -= RANGE;					
				}

				
				encryptedString += (char) encryptedLetter;//Adds letter to empty string making an "Encrypted" one
			}

			return encryptedString;
		}

		
		 
		public static String decryptBellaso(String encryptedText, String bellasoStr) 
		{
		
			String decryptedString = ""; //Cause we need to build a new string letter by letter, so 
										 //It's like adding numbers to "0"
		
		
			
			int belassoLength = bellasoStr.length(); 
			
			int lowerBound = (int) LOWER_BOUND; 

			for (int i = 0; i < encryptedText.length(); i++) {
				
				char letter = encryptedText.charAt(i);
				int decryptedLetter = (int)letter - (int)bellasoStr.charAt(i % belassoLength);


				while (decryptedLetter < lowerBound) 
				{
					decryptedLetter += RANGE; 
				}


				decryptedString += (char) decryptedLetter;//Adds letter to empty string making an "decrypted" one
			}

			return decryptedString;
		}

}
