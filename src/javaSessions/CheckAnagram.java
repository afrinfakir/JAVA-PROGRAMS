package javaSessions;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		
		String s1="listen";
		String s2="silent";
			
		if(areAnagrams(s1,s2)) {
			System.out.println(s1+" "+s2 + " are ANAGRAM");
		}
		else{
			System.out.println(s1+" "+s2 + " are not ANAGRAM");
		}

	}
		
	public static boolean areAnagrams(String s1,String s2) {
		
		//remove whiteSpaces and convert string into lowercase
		s1=s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.replaceAll("\\s", "").toLowerCase();
		
		//System.out.println(s1);
		//System.out.println(s2);
		
		if(s1.length()!=s2.length()) {
			return false;
		}
				//convert string to char array
				char[] chararray1 = s1.toCharArray();
				char[] chararray2 = s2.toCharArray();
				
				//sort the char array
				Arrays.sort(chararray1);
				Arrays.sort(chararray2);
				
				//compare sorted arrays
				boolean flag= Arrays.equals(chararray1, chararray2);
				
				return flag;
				
	}	
		
	}
