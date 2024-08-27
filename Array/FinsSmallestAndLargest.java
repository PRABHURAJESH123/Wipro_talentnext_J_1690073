package mypack;

public class FinsSmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        // Initialize the integer array
		        int[] intArray = {10, 20, 30, 40, 50, 5, 25};

		        // Check if the array has at least two elements
		        if (intArray.length < 2) {
		            System.out.println("Array should have at least two elements.");
		            return;
		        }

		        // Initialize the variables for the two largest and two smallest numbers
		        int largest1 = Integer.MIN_VALUE;
		        int largest2 = Integer.MIN_VALUE;
		        int smallest1 = Integer.MAX_VALUE;
		        int smallest2 = Integer.MAX_VALUE;

		        // Iterate through the array to find the two largest and two smallest numbers
		        for (int num : intArray) {
		            // Update the largest numbers
		            if (num > largest1) {
		                largest2 = largest1;
		                largest1 = num;
		            } else if (num > largest2) {
		                largest2 = num;
		            }

		            // Update the smallest numbers
		            if (num < smallest1) {
		                smallest2 = smallest1;
		                smallest1 = num;
		            } else if (num < smallest2) {
		                smallest2 = num;
		            }
		        }

		        // Print the two largest and two smallest numbers
		        System.out.println("The largest two numbers are: " + largest1 + " and " + largest2);
		        System.out.println("The smallest two numbers are: " + smallest1 + " and " + smallest2);
		    }
		


	}


