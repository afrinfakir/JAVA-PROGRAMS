package javaSessions;

public class FirstNonRepeatingChar {
	//virtusa IQ
	public static void main(String[] args) {
        String str = "aabbcdeffg";
        int[] count = new int[256];  // to store frequency of each char

        // Step 1: Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        // Step 2: Find index of first non-repeating character
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count[ch] == 1) {
                index = i;
                break;
            }
        }

        // Step 3: Print result
        System.out.println("Input String: " + str);
        System.out.println("First non-repeating character index: " + index);
    }
}
