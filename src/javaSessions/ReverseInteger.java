package javaSessions;

public class ReverseInteger {

	public static void main(String[] args) {


			int num=12345;
			int rev=0;
			int t=num;
			while(num!=0) {
				rev=rev*10+num%10;
				num=num/10;
				
			}
			System.out.println(rev);
			if(rev==t) {
				System.out.println("Given number is pallindrome");
			}
			else {
				System.out.println("Number is not pallindrome");
			}
			
			System.out.println("-----------------------------------");
			String a="Hello";
			String b="World";
			a=a+b;
			System.out.println(a);
			
			b=a.substring(0,a.length()-b.length());
			System.out.println(b);
			
			a=a.substring(b.length());
			System.out.println(a);
			
			
	}

}
