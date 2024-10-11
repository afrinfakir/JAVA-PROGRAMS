package javaSessions;

public class PrintVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintAllVowels("afrin riyaj fakir");
	}

	public static void PrintAllVowels(String str) {
		String vowels = "AEIOUaeiou";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (vowels.indexOf(ch) != -1) {
				System.out.print(ch+" ");
			}
		}
	}

}
