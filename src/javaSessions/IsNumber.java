package javaSessions;

public class IsNumber {

	public static void main(String[] args) {

		isPhoneNumber("9172755864gh");
		
	}

	public static boolean isNumber(String number) {

		try {
			Long.parseLong(number);
			System.out.println("Valid NUmber : " + number);
		} catch (NumberFormatException e) {
			System.out.println("Not a valid Number :" + number);
			return false;
		}
		return true;
	}

	public static boolean isPhoneNumber(String number) {

		if (number.length() == 10 && isNumber(number)) {

			System.out.println("Valid phone number : " + number);
			return true;
		}
		System.out.println("Not a valid phone number : " + number);
		return false;

	}
	
	

}
