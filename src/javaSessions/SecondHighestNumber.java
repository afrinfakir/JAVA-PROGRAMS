package javaSessions;


	
	public class SecondHighestNumber {
	    public static int findSecondHighest(int[] array) {
	        if (array == null || array.length < 2) {
	            throw new IllegalArgumentException("Array must have at least two elements");
	        }

	        int highest = Integer.MIN_VALUE;
	        int secondHighest = Integer.MIN_VALUE;

	        for (int number : array) {
	            if (number > highest) {
	                secondHighest = highest;
	                highest = number;
	            } else if (number > secondHighest && number < highest) {
	                secondHighest = number;
	            }
	        }

	        return secondHighest;
	    }

	    public static void main(String[] args) {
	        int[] array = {3, 5, 7, 2, 8, 1, 125, 100, 4};
	        try {
	            int secondHighest = findSecondHighest(array);
	            System.out.println("The second highest number is: " + secondHighest);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


