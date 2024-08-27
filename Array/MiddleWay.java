package mypack;

import java.util.Arrays;

public class MiddleWay {

	public static void main(String[] args) {
		
		        // Example arrays
		        int[] a1 = {1, 2, 3};
		        int[] b1 = {4, 5, 6};
		        int[] a2 = {7, 7, 7};
		        int[] b2 = {3, 8, 0};
		        int[] a3 = {5, 2, 9};
		        int[] b3 = {1, 4, 5};

		        // Print results
		        System.out.println("middleWay: " + Arrays.toString(middleWay(a1, b1)));
		        System.out.println("middleWay: " + Arrays.toString(middleWay(a2, b2)));
		        System.out.println("middleWay: " + Arrays.toString(middleWay(a3, b3)));
		    }

		    public static int[] middleWay(int[] a, int[] b) {
		        // Create a new array of length 2 to store middle elements
		        int[] result = new int[2];
		        
		        // Assign middle elements from arrays a and b to result array
		        result[0] = a[1];
		        result[1] = b[1];
		        
		        return result;
		    }
		


	}


