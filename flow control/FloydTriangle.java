package mypack;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Check if exactly one argument (size of the triangle) is passed
		        if (args.length != 1) {
		            System.out.println("Please enter an integer number");
		            return;
		        }

		        // Parse the size of the triangle from command-line argument
		        int size = Integer.parseInt(args[0]);

		        // Check if the size is greater than 0
		        if (size <= 0) {
		            System.out.println("Please enter a positive integer number");
		            return;
		        }

		        // Print Floyd's Triangle
		        int number = 1;
		        for (int i = 1; i <= size; i++) {
		            // Print numbers in each row
		            int j = 1;
		            while (j <= i) {
		                System.out.print(number + " ");
		                number++;
		                j++;
		            }
		            System.out.println(); // Move to the next line after each row
		        }
		    }
		


	}


