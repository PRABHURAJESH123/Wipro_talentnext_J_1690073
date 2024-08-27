package mypack;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Check if exactly 4 arguments are passed
		        if (args.length != 4) {
		            System.out.println("Please enter 4 integer numbers");
		            return;
		        }

		        // Parse command line arguments to integers
		        int[][] arr = new int[2][2];
		        arr[0][0] = Integer.parseInt(args[0]);
		        arr[0][1] = Integer.parseInt(args[1]);
		        arr[1][0] = Integer.parseInt(args[2]);
		        arr[1][1] = Integer.parseInt(args[3]);

		        // Print the original array
		        System.out.println("The given array is:");
		        printArray(arr);

		        // Reverse the array
		        int[][] reversedArray = reverseArray(arr);

		        // Print the reversed array
		        System.out.println("\nThe reverse of the array is:");
		        printArray(reversedArray);
		    }

		    // Method to print a 2x2 array
		    public static void printArray(int[][] arr) {
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr[i].length; j++) {
		                System.out.print(arr[i][j]);
		            }
		            System.out.println();
		        }
		    }

		    // Method to reverse a 2x2 array
		    public static int[][] reverseArray(int[][] arr) {
		        int[][] reversedArray = new int[2][2];
		        reversedArray[0][0] = arr[1][1];
		        reversedArray[0][1] = arr[1][0];
		        reversedArray[1][0] = arr[0][1];
		        reversedArray[1][1] = arr[0][0];
		        return reversedArray;
		    }
		


	}


