package javaSessions;

import java.util.Arrays;

public class SortingOfArrays {

	public static void main(String[] args) {
		// int arr[] = { 0, 1, 1, 0, 1, 0, 1 };

		int[] arr = { 5, 3, 8, 1, 2, 7 };

		// Sort the array using built-in method
		// Arrays.sort(arr);

		// Print the sorted array
		// System.out.println("Sorted array: " + Arrays.toString(arr));
		System.out.println("-------------------------");

		System.out.println("Before sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		bubbleSort(arr); // sorting

		System.out.println("\nAfter sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void bubbleSort(int[] arr) {

        // Outer loop → runs (n-1) times
        for (int i = 0; i < arr.length-1; i++) {

            // Inner loop → compares adjacent elements
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

	}
}
