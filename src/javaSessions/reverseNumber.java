package javaSessions;

public class reverseNumber {

	public static void reversNumber(int num) {

		int rev = 0;
		int org_num = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("reverse number :" + rev);

		if (org_num == rev) {
			System.out.println("Given number is pallindrome :" + org_num);
		} else {
			System.out.println("Number is not a pallindrome");
		}

	}

	public static void main(String[] args) {
		reversNumber(121234);

	}

}
