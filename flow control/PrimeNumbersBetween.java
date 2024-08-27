package mypack;

public class PrimeNumbersBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        System.out.println("Prime numbers between 10 and 99:");

		        // Iterate through numbers from 10 to 99
		        for (int num = 10; num <= 99; num++) {
		            // Check if current number is prime
		            if (isPrime(num)) {
		                System.out.print(num + " ");
		            }
		        }
		    }

		    // Method to check if a number is prime
		    public static boolean isPrime(int num) {
		        // Handle base cases
		        if (num <= 1) {
		            return false;
		        }
		        if (num <= 3) {
		            return true;
		        }

		        // Check for divisibility from 2 to sqrt(num)
		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false; // Not prime
		            }
		        }
		        return true; // Prime
		    }
		


	}


