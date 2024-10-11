package interviewCode;


//LTI Interview question
public class Derived extends Test {
	void myMethod() {
		System.out.println("SF");
	}

	public static void main(String[] args) {
		Derived object = new Derived();
		object.myMethod();
	}
}
