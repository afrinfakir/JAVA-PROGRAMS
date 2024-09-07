package javaSessions;

public class CharacterRepeaat {

	    public static void main(String[] args) {
	        String input = "demo";
	        String output = transformString(input);
	        System.out.println("Output: " + output);
	    }

	    //Infosys interview ques
	    
	    public static String transformString(String str) {
	        String result = "";

	        // Loop through each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            
	            // Repeat the character (i+1) times and add to the result
	            for (int j = 0; j <= i; j++) {
	                result += currentChar;
	            }
	        }

	        return result;
	    }
	}


