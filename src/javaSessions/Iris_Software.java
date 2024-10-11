package javaSessions;

public class Iris_Software {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Iris software office opened in Pune";
		//CountChar(str);
		reverseString(str);
		

	}

	public static void CountChar(String str) {
		int[] count = new int[256];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}
		for (int i = 0; i < 256; i++) {
			if (count[i] > 0) {
				System.out.println((char) i + "---" + count[i]);
			}
		}
	}

	public static void reverseString(String str) {
		String output = "";
		String[] s = str.split(" ");
		System.out.println(s[0]);
		for (int i = 0; i < s.length; i++) {
			String word =s[i];
			//System.out.print(" ");
			for (int j = word.length() - 1; j >= 0; j--) {
				char ch = word.charAt(j);
				output = output + ch;
				//System.out.print(" ");
			}
			//System.out.print(" ");
			// Add a space after each word except for the last one
	        if (i < s.length - 1) {
	            output += " ";
	        }

			
		}
		System.out.println(output);

	}
}
