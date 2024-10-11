package javaSessions;

public class AlternateCapSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlternateSmallCap("Synechron interview with prasad wani");

	}

	public static void AlternateSmallCap(String str) {

		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i % 2 == 0) {
				output += Character.toUpperCase(ch);
			} else {
				output += Character.toLowerCase(ch);
			}
		}
		System.out.println("Input :" + str);
		System.out.println("Alternate capital & small :" + output);
	}

}
