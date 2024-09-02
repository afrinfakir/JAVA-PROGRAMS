package javaSessions;

public class specificwordReplace {

	public static void main(String[] args) {
		
		String str = "Afrin is my name";
		System.out.println(str);
		String str2 = "My name is Afrin";
		 //String Final = str2.replace("is my name", "My name is");
		if(str.equalsIgnoreCase(str)) {
			System.out.println(str2);
		}
		else {
			System.out.println("Input string not recognised");
		}

			
	}

}
