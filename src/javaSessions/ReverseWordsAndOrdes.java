package javaSessions;

public class ReverseWordsAndOrdes {
	    public static void main(String[] args) {
	        String input = "you are very clever";
	        String output = reverseWordsAndOrder(input);
	        System.out.println("Output: " + output);
	    }

	    public static String reverseWordsAndOrder(String str) {
	        // Split the string into words
	        String[] words = str.split(" ");
	        String result = "";

	        // Loop through the words array
	        
	        //1.changing positions
	       // for (int i = words.length - 1; i >= 0; i--) {
	        
	       // 2.without changing positions
	        	for(int i=0;i<words.length;i++) {
	            // Reverse each word
	            String reversedWord = reverseWord(words[i]);
	            // Append the reversed word to the result string
	            result += reversedWord + " ";
	        }

	        // Trim any trailing space and return the result
	        return result.trim();
	    }

	    // Method to reverse a single word
	    public static String reverseWord(String word) {
	        String reversed = "";
	        for (int i = word.length() - 1; i >= 0; i--) {
	            reversed += word.charAt(i);
	        }
	        return reversed;
	    }
	}


