package javaSessions;

public class ArmstrongNumber {

	public static void main(String[] args) {

		ArmStrong(153);
		
	}
	
	public static void ArmStrong(int number) {
		
		int cube=0;
		int r;
		int t=number;
				
				while(number!=0) {
					r = number%10;
					number=number/10;
					cube=cube+(r*r*r);
				}
				if(t==cube) {
					System.out.println("Armstrong number");
				}
				else {
					System.out.println("Not an ArmStrong number");
				}
	}

}
