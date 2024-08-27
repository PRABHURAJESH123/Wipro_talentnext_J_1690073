package mypack;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Check if exactly 9 arguments are passed
		        if (args.length != 9) {
		            System.out.println("Please enter 9 integer numbers");
		            return;
		        }

		        // Parse command line arguments to integers and construct the 3x3 array
		        int[][] arr = new int[3][3];
		        int index = 0;
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr[i].length; j++) {
		                arr[i][j] = Integer.parseInt(args[index]);
		                index++;
		            }
		        }

		        // Print the original array
		        System.out.println("The given array is:");
		        printArray(arr);

		        // Find the maximum number in the array
		        int maxNumber = findMax(arr);

		        // Print the maximum number found
		        System.out.println("\nThe biggest number in the given array is " + maxNumber);
		    }

		    // Method to print a 3x3 array
		    public static void printArray(int[][] arr) {
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr[i].length; j++) {
		                System.out.print(arr[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }

		    // Method to find the maximum number in a 3x3 array
		    public static int findMax(int[][] arr) {
		        int max = arr[0][0];
		        // Iterate through the array to find the maximum number
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr[i].length; j++) {
		                if (arr[i][j] > max) {
		                    max = arr[i][j];
		                }
		            }
		        }
		        return max;
		    }
		


	}


