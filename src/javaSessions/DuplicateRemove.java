package javaSessions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,1,2,3,4,3,2,1,5,2,3,1,2,1,3,4};
		//removeDuplicates(a);
		rmDuplicates(a);
		
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
	 
	 public static void rmDuplicates(int[] a) {
		 List<Integer> result = new ArrayList<Integer>();
		 for(int num:a) {
			 if(!result.contains(num)) {
				 result.add(num);
			 }
		 }
		 System.out.println(result);
	 }

}
