package javaSessions;

public class IsNumber {

	public static void main(String[] args) {

		isNumber("344n");
	}
	
	public static boolean isNumber(String number) {
		
		try {
		Long.parseLong(number);
		System.out.println("Valid NUmber : "+ number);
	}
		catch(NumberFormatException e) {
			System.out.println("Not a valid Number :"+ number);
			return false;
		}
		
		return true;

}
}
