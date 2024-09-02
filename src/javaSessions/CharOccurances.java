package javaSessions;

public class CharOccurances {

	public static void main(String[] args) {
		
		charOcuurances("Lorem Ipsum is simply dummy text of the printing and typesetting industry");
		
	}
	
	public static void charOcuurances(String str) {
			
		int[] count=new int[256];
		
		for(int i=0;i<str.length();i++) {
			
			char ch =str.charAt(i);
			count[ch]++;
		}
		
		for(int i=0;i<256;i++) {
			if(count[i]>0) {
				System.out.println((char)i +" : "+count[i]);
			}
		}
	}

}
