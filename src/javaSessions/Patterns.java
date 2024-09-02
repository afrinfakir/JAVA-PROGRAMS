package javaSessions;

public class Patterns {

	public static void main(String[] args) {

		pattern8(3);

	}

	public static void pattern1(int n) {
		// Number of rows available=number of lines
		for (int row = 1; row <= n; row++) {

			// identify for every row number how many columns are there
			// types of elements in the columns
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			// when one row is printed we need to add new line
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		// Number of rows available=number of lines
		for (int row = 1; row <= n; row++) {

			// identify for every row number how many columns are there
			// types of elements in the columns
			for (int col = 1; col <= row; col++) {
				System.out.print(row + " ");
			}
			// when one row is printed we need to add new line
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		// Number of rows available=number of lines
		for (int row = 1; row <= n; row++) {

			// identify for every row number how many columns are there
			// types of elements in the columns
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			// when one row is printed we need to add new line
			System.out.println();
		}
	}

	public static void pattern4(int n) {
		// Number of rows available=number of lines
		for (int row = 1; row <= n; row++) {

			// identify for every row number how many columns are there
			// types of elements in the columns
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("* ");
			}
			// when one row is printed we need to add new line
			System.out.println();
		}
	}

	public static void pattern5(int n) {
		// Number of rows available=number of lines
		for (int row = 0; row < 2 * n; row++) {

			// identify for every row number how many columns are there
			// types of elements in the columns
			int totalColsInRow = row > n ? 2 * n - row : row;
			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("* ");
			}
			// when one row is printed we need to add new line
			System.out.println();
		}
	}

	public static void pattern6(int n) {

		for (int row = 0; row <= 2 * n; row++) {

			int totalCol = row > n ? 2 * n - row : row;
			for (int col = 0; col <= totalCol; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {

		for (int row = 0; row < 2 * n; row++) {

			int totalcolInRow = row > n ? 2 * n - row : row;

			for (int s = 0; s < n - totalcolInRow; s++) {
				System.out.print(" ");
			}
			for (int col = 0; col < totalcolInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern8(int n) {

		for (int row = 1; row <= n; row++) {

			// int totalCOlInRow= row>n?2*n-row:row;
			// int space = n-totalCOlInRow;
			for (int s = 0; s < n - row; s++) {
				System.out.print("  ");
			}

			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for (int col = 2; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

//	public static void countChar(String str) {
//		
//		//Lorem Ipsum is simply dummy text of the printing and typesetting industry
//		
////		int len = str.length();
	// int count[]=new int[256];
//		//if(str)
//	}
}
