package javaSessions;

public class PyramidPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);

	}
	
	public static void pattern(int n) {
		int num=1;
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=n-row+1;col++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
