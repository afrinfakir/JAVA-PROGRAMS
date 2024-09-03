package javaSessions;

public class PyramidPattern {

	public static void main(String[] args) {

pyramid(5);
	}
	
	public static void pyramid(int n) {
		
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("  ");
			}
			
			for(int col=1;col<row;col++) {
				System.out.print("* ");
			}
			
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
