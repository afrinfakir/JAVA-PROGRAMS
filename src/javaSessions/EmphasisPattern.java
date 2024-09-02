package javaSessions;

public class EmphasisPattern {

	public static void main(String[] args) {

			pattern(5);
	}
	
	public static void pattern(int n) {
		//1 2 3 4 5
		
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=n-row+1;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
