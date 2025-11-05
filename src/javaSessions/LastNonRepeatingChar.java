package javaSessions;

public class LastNonRepeatingChar {

	public static void main(String[] args) {
		String str = "aabbcdeffgkppP"; // example input
		int[] count = new int[256]; // ASCII count array

		// Step 1: Count frequency of each character
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}

		// Step 2: Traverse from end to find last non-repeating char
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (count[ch] == 1) {
				System.out.println("Last non repeating character:" + ch);

				break;
			}
		}

	}

}
