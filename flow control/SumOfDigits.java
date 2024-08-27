package mypack;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Check if exactly one argument (number) is passed
		        if (args.length != 1) {
		            System.out.println("Usage: java SumOfDigits <number>");
		            return;
		        }

		        // Read the number from command-line argument
		        int num = Integer.parseInt(args[0]);

		        // Calculate sum of digits
		        int sum = 0;
		        int originalNum = num;

		        while (originalNum != 0) {
		            int digit = originalNum % 10;
		            sum += digit;
		            originalNum /= 10;
		        }

		        // Print the sum of digits
		        System.out.println("Sum of digits of " + num + " is: " + sum);
		    }
		


	}


