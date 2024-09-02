package javaSessions;

public class Employee<E> {
	private E e;

	public void set(E e) {
		this.e = e;
	}

	public E get() {
		return e;
	}

	public static void main(String[] args) {
		Employee<Integer> employee = new Employee<Integer>();
		employee.set(46091095);
		System.out.println(employee.get());
	}

	interface pair<k, v> {
		public k getKey();

		public v getvalue();
	}

	//public class orderedpair<k,v> implements pair<k,v>
	
//	{
//		private Object object;
//		
//		public void set(Object object)
//		{
//			this.object=object;
//		}
//		public Object get() {
//			return object;
//		}
//	}
//	public class EmployeeGen<E>
//	{
//		private E e;
//		
//		public void set(E e)
//		{
//			this.e=e;
//		}
//		public E get() {
//			return e;
//		}
	//}

}
