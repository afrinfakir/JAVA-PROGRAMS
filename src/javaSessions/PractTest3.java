package javaSessions;

public class PractTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = RemoveDulicates("Welcome to java");
		System.out.println(output);//(output);

	}

	// Welcome to Java
	public static String RemoveDulicates(String str) {
		String result = "";
		int length = str.length();
		for (int i = 0; i < length; i++) {
			
			char ch = str.charAt(i);
			
			if(result.indexOf(ch)==-1)
			{
			    result=result+ch;
			}

		}
		return result;

	}
}

