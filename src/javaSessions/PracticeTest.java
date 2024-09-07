package javaSessions;

public class PracticeTest {

	public static void main(String[] args) {


		System.out.println("Vovel count: "+extractVovel("RAINBOW"));
	}

	public static int extractVovel(String str) {
		int length = str.length();
		str = str.toLowerCase();
		int vovel = 0;

		for (int i = 0; i < length; i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vovel++;
			}
		}
		return vovel;
	}

}
