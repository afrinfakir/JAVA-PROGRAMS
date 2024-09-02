package javaSessions;

public class reverseWords {

	

		
		    public static void main(String[] args) {
		        String input = "I love my country";
		        String output = reverseWordss(input);
		        System.out.println("Input: " + input);
		        System.out.println("Output: " + output);
		    }

		    public static String reverseWordss(String str) {
		        // Split the input string by spaces
		        String[] words = str.split(" ");
		        String reversed = "";

		        // Traverse the array of words in reverse order and append to the result
	        for (int i = words.length - 1; i >= 0; i--) {
	        	
		            reversed = reversed + words[i] + " ";
		        }
//		        for (int i = 0; i <= words.length - 1; i++) {
//		            reversed = reversed + words[i] + " ";
//		        }

		        // Remove the trailing space and return the result
		        return reversed.trim();
		    }
		
	}


