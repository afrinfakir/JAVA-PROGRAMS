package javaSessions;

public class missingNumber {

	public static void main(String[] args) {

		int sum1=0;
			int a[]= {0,1,2,3,4,6,7,8,9,10};
			int sum=0;
			for(int i=0;i<a.length;i++) {
				sum=sum+a[i];
			}
			System.out.println(sum);
	
	
	
	for(int j=0;j<=10;j++) {
		sum1=sum1+j;
	}
	System.out.println(sum1);
	
	int missingNumber=sum1-sum;
	System.out.println("MISSINGNUMBER : "+missingNumber);
}
}
