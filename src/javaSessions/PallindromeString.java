package javaSessions;

public class PallindromeString {

	public static void pallindromString(String str) {

		String org_str = str;
		String rev = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		if (org_str.equals(rev)) {
			System.out.println("The string is pallindrome");
		} else {
			System.out.println("String is not pallindrome");
		}
	}

	public static void main(String[] args) {
		pallindromString("madam");

	}

}
