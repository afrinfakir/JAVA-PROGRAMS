package javaSessions;

public class citiusTech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10 / 0;
			System.out.println("This will not be printed");
		} catch (Exception e) {
			System.out.println("Exception caught");
		} finally {
			System.out.println("Finally block executed");

		}

		System.out.println("-----");
		

		String s1 = new String("xyz");
		String s2 = "xyz";
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.intern() == s2);
		
		
		System.out.println("-----");
		
		
		int a = 5;
		int b = 10;
		if ((a = 3) == b) {
			System.out.println(a);
		} else {
			System.out.println(a + b);
		}
	}

}
