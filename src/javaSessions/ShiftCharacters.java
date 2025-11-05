package javaSessions;

public class ShiftCharacters {
	
	public static void main(String[] args) {
        String input = "abcdp";
        String output = "";

        //infosys interview
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // get each character
            char next = (char)(ch + 1); // move to next character
            output = output + next;     // add to output string
        }

        System.out.println("Input  : " + input);
        System.out.println("Output : " + output);
    }

}
