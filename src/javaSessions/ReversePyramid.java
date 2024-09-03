package javaSessions;

public class ReversePyramid {

	public static void main(String[] args) {

ReversePyramids(5);
	}
	
	public static void ReversePyramids(int n) {
		
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row;col++) {
				System.out.print("  ");
			}
			
			for(int col =1;col<n-row+1;col++) {
				System.out.print("* ");
			}
			
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
