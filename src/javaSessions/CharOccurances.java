package javaSessions;

public class CharOccurances {

	public static void main(String[] args) {
		
		//charOcuurances("Lorem Ipsum is simply dummy text of the printing and typesetting industry");
		//charOcuurances("Aafrin@@&5&&");
		int[] arr = {4, 2, 7, 4, 9, 2, 3, 4, 7,434,565,565,1999};
        countNumbers(arr);
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
	public static void countNumbers(int[] arr) {

        int[] count = new int[2000]; // array to store frequency of each number (0–999)

        // 1️⃣ Count how many times each number appears
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;   // increment count at that number's index
        }
        
        // 2️⃣ Print numbers and their counts
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + " : " + count[i]);
            }
        }
    }


}
