package javaSessions;

public class ReplaceString {

	public static void main(String[] args) {

		 String input = "abcrestart the computer";
		 
		System.out.println(input.substring(0, 3)); 
		 
		 int highestindex =input.length()-1;
		 System.out.println(highestindex);
	        
	        // Find the index of the first 'r'
	        int firstIndex = input.indexOf('r');
	        
	        // If 'r' exists and is not the last character
	        if (firstIndex != -1 && firstIndex < highestindex) {
	            // Replace 'r' characters starting from the second occurrence
	            String replacedString = input.substring(0, firstIndex+1 )
	            		+ input.substring(firstIndex+1 ,input.length())
	            		.replace('r', '#');
	            
	            // Print the resulting string
	            System.out.println(replacedString);
	        } else {
	            // If no 'r' found or only one 'r' is present
	            System.out.println(input);
	        }
	    }
	}