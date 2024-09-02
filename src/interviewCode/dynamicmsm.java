package interviewCode;

class car {
	public void  start() {
		System.out.println("start method calls");
	}
	public void stop() {
		System.out.println("stop method calls");
	}
	public void refuel() {
		System.out.println("refuel method");
	}
}
 class BMW extends car {
	 @Override
	 public void start() {
		 System.out.println("start override method calls");
	 }
	 
	 public void autopark() {
		 System.out.println("auto park");
	 }
 }
public class dynamicmsm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new BMW();//upcasting
		c.start();
		c.stop();
		c.refuel();
		//c.autopark();
		BMW b1 =(BMW) new car();//downcasting
		b1.autopark();
		
		
		
	}

}
