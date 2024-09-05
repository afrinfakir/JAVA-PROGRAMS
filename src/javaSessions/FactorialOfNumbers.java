package javaSessions;

public class FactorialOfNumbers {

	public static void main(String[] args) {
		
		int number =1;
		long fact = factorial(number);
		System.out.println("Factorial of "+number+": "+ fact);
	}

	public static long factorial(int n) {

		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;

	}

}
