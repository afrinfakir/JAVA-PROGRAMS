package javaSessions;

import java.util.LinkedHashSet;

public class DuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,1,2,3,4,3,2,1,5,2,3,1,2,1,3,4};
		removeDuplicates(a);
		
	}
	 public static void removeDuplicates(int[] a)
	    {
	        LinkedHashSet<Integer> set
	            = new LinkedHashSet<Integer>();

	        // adding elements to LinkedHashSet
	        for (int i = 0; i < a.length; i++)
	            set.add(a[i]);

	        // Print the elements of LinkedHashSet
	        System.out.print(set);
	    }

}
