package javaSessions;

public class practTest {

	public static void main(String[] args) {
		int[] arr = { 1, 15, 21, 13, 10, 4, 12, 24 }; // Input array
		//boolean[] used = new boolean[arr.length]; // Array to track used elements

		// Loop through the array
		for (int i = 0; i < arr.length; i++) {
			// Skip this element if it is already part of a pair
			//if (used[i])
				//continue;

			for (int j = i + 1; j < arr.length; j++) {
				// Skip this element if it is already part of a pair
				//if (used[j])
				//	continue;

				// Check if the sum of the pair is 25
				if (arr[i] + arr[j] == 25) {
					System.out.println("(" + arr[i] + ", " + arr[j] + ")");
					//used[i] = true; // Mark element i as used
					//used[j] = true; // Mark element j as used
					//break; // Move on to the next element in the outer loop
				}
			}
		}
	}
}
