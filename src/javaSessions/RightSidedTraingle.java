package javaSessions;

public class RightSidedTraingle {

	public static void main(String[] args) {

		RightSidedTraingles(5);
	}
	
	public static void RightSidedTraingles(int n) {
		
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row;col++) {
				System.out.print("  ");
			}
			
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
