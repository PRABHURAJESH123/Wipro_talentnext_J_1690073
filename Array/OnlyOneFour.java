package mypack;

public class OnlyOneFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Example arrays
		        int[] array1 = {1, 4, 1, 4};
		        int[] array2 = {1, 4, 2, 4};
		        int[] array3 = {1, 1};

		        // Print results
		        System.out.println("only14: " + only14(array1));
		        System.out.println("only14: " + only14(array2));
		        System.out.println("only14: " + only14(array3));
		    }

		    public static boolean only14(int[] nums) {
		        // Iterate through the array
		        for (int num : nums) {
		            if (num != 1 && num != 4) {
		                return false; // Found a number that is not 1 or 4
		            }
		        }
		        return true; // All numbers are 1 or 4
		    }
		


	}


