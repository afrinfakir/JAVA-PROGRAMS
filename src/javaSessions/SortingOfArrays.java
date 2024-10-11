package javaSessions;

import java.util.Arrays;

public class SortingOfArrays {

	public static void main(String[] args) {
		//int arr[] = { 0, 1, 1, 0, 1, 0, 1 };
		
		int[] arr = {5, 3, 8, 1, 2, 7};

        // Sort the array using built-in method
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
		
		
	}
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }

	}


