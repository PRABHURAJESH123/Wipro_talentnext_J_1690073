package mypack;

import java.util.Arrays;

public class RemoveTens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Example arrays
		        int[] array1 = {1, 10, 10, 2};
		        int[] array2 = {10, 2, 10};
		        int[] array3 = {1, 99, 10};

		        // Print results
		        System.out.println("Without tens: " + Arrays.toString(withoutTen(array1)));
		        System.out.println("Without tens: " + Arrays.toString(withoutTen(array2)));
		        System.out.println("Without tens: " + Arrays.toString(withoutTen(array3)));
		    }

		    public static int[] withoutTen(int[] nums) {
		        // Create a result array with the same length as nums
		        int[] result = new int[nums.length];
		        int index = 0;

		        // Iterate through nums
		        for (int num : nums) {
		            if (num != 10) {
		                result[index] = num;
		                index++;
		            }
		        }

		        // Fill the remaining elements of result with 0
		        while (index < result.length) {
		            result[index] = 0;
		            index++;
		        }

		        return result;
		    }
		

	}


