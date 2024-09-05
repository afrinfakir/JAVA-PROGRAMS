package javaSessions;

public class CountVowelsConsonants {

	public static void main(String[] args) {

		// CountConsonantsVowels("afrin riyaj fakir");
		cleanString();

	}

	public static void cleanString() {

		String str1 = "123-456-789";// 123456789//CBA interview ques

		String str2 = str1.replace("-", "");
		
		System.out.println(str2);

	}

	public static void CountConsonantsVowels(String str) {

		int vowels = 0;
		int consonants = 0;
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				vowels++;

			} else if (ch >= 'a' && ch <= 'z') {

				consonants++;
			}

		}
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);

	}

}
