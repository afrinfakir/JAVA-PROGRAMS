package javaSessions;

public class primeNumber {

	public static void main(String[] args) {

	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;

	}
	
	public static void getPrime(int number) {
		for(int i=2;i<=number;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
