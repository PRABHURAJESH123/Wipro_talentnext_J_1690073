package mypack;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Check if exactly one argument (number) is passed
		        if (args.length != 1) {
		            System.out.println("Usage: java ReverseNumber <number>");
		            return;
		        }

		        // Read the number from command-line argument
		        int number = Integer.parseInt(args[0]);

		        // Reverse the number using a while loop
		        int reversedNumber = 0;
		        int originalNumber = number;

		        while (originalNumber != 0) {
		            int remainder = originalNumber % 10;
		            reversedNumber = reversedNumber * 10 + remainder;
		            originalNumber /= 10;
		        }

		        // Print the reversed number
		        System.out.println("Reversed number: " + reversedNumber);
		    }
		


	}


