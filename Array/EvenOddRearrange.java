package mypack;

import java.util.Arrays;

public class EvenOddRearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Example arrays
		        int[] array1 = {1, 0, 1, 0, 0, 1, 1};
		        int[] array2 = {3, 3, 2};
		        int[] array3 = {2, 2, 2};

		        // Print results
		        System.out.println("Even-odd rearranged: " + Arrays.toString(evenOdd(array1)));
		        System.out.println("Even-odd rearranged: " + Arrays.toString(evenOdd(array2)));
		        System.out.println("Even-odd rearranged: " + Arrays.toString(evenOdd(array3)));
		    }

		    public static int[] evenOdd(int[] nums) {
		        // Create a result array with the same length as nums
		        int[] result = new int[nums.length];
		        int evenIndex = 0;
		        int oddIndex = nums.length - 1;

		        // Iterate through nums
		        for (int num : nums) {
		            if (num % 2 == 0) {  // even number
		                result[evenIndex] = num;
		                evenIndex++;
		            } else {  // odd number
		                result[oddIndex] = num;
		                oddIndex--;
		            }
		        }

		        return result;
		    }
		


	}


