package javaSessions;

public class ReverseUsingBufferAndBuilder {

	public static void main(String[] args) {
		
		String originalString = "Hello World";

        // Create a StringBuilder object with the original string
        //StringBuilder sb = new StringBuilder(originalString);
		StringBuffer sf = new StringBuffer(originalString);

        // Use the reverse() method of StringBuilder
        //sb.reverse();
		sf.reverse();

        // Convert the StringBuilder back to a String and print the result
        String reversedString = sf.toString();

        // Output the reversed string
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
        System.out.println(sf.reverse());

	}

}
