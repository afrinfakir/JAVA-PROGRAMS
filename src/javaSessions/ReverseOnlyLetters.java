package javaSessions;

public class ReverseOnlyLetters {
	public static void main(String[] args) {
        String input = "abActest12pop90java989pytdfg";
        String output = "";
        String temp = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character is a letter, add to temp word
            if (Character.isLetter(ch)) {
                temp = ch + temp;  // reverse build-up
            } else {
                // Non-letter (like digit): add reversed temp + digit to output
                output = output + temp + ch;
                temp = "";  // reset for next word
            }
        }

        // Add any remaining reversed letters at the end
        output = output + temp;

        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
    }
}
