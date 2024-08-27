package mypack;

public class SumArrayWithCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Example array elements
		        int[] intArray1 = {10, 3, 6, 1, 2, 7, 9};
		        int[] intArray2 = {7, 1, 2, 3, 6};
		        int[] intArray3 = {1, 6, 4, 7, 9};

		        // Calculate and print the sum for each example array
		        System.out.println("Sum for intArray1: " + calculateSum(intArray1));
		        System.out.println("Sum for intArray2: " + calculateSum(intArray2));
		        System.out.println("Sum for intArray3: " + calculateSum(intArray3));
		    }

		    public static int calculateSum(int[] intArray) {
		        int sum = 0;
		        boolean ignore = false;

		        for (int num : intArray) {
		            if (num == 6) {
		                ignore = true;
		            }
		            if (!ignore) {
		                sum += num;
		            }
		            if (ignore && num == 7) {
		                ignore = false;
		            }
		        }

		        return sum;
		    }
		


	}


