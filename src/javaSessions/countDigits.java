package javaSessions;

public class countDigits {
	
	public static void countDigit(int num) {
		
		int count = 0;
		while(num>0) {
			num = num/10;
			count++;
		}
		System.out.println("number of digits:"+count);
	}

	public static void main(String[] args) {

			countDigit(34543545);
	}

}
