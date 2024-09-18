package javaSessions;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String output=removeDuplicate("aafdfaaavfatima");
		System.out.println(output);
	}
	
	public static String removeDuplicate(String str){

		int length = str.length();
		String result="";
		//int count[]=new int [256];

		for(int i=0;i<length;i++){

		char ch = str.charAt(i);

		if(result.indexOf(ch)== -1){
			result=result+ch;
		}

		}
		return result;


	}}
