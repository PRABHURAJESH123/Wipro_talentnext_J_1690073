package mypack;

public class ArraySumAndAverage {

	
	    public static void main(String[] args) {
	        // Initialize the integer array
	        int[] intArray = {10, 20, 30, 40, 50};
	        
	        // Calculate the sum of the array
	        int sumOfArray = 0;
	        for (int num : intArray) {
	            sumOfArray += num;
	        }
	        
	        // Calculate the average of the array
	        double averageOfArray = (double) sumOfArray / intArray.length;
	        
	        // Print the sum and average
	        System.out.println("Sum of the array: " + sumOfArray);
	        System.out.println("Average of the array: " + averageOfArray);
	    }
	}


