package javaSessions;

import java.util.Arrays;

public class Practicetest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,5,3,4,1,2};
		System.out.println(removeduplicates(a));

	}
	
	public static int removeduplicates(int arr[]){
//	    if (n == 0 || n == 1) {
//	        return n;
//	    }
	    Arrays.sort(arr);  
	    int j = 0;
	    for ( int i = 1; i < arr.length-1 ; i++) {
	        if (arr[i] != arr[i-1]) {
	            arr[++j] = arr[i];
	        }
	    }
	    return j;
	}

}
