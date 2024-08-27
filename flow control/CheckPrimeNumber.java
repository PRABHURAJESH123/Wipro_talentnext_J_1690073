package mypack;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Example usage: Check if 29 is prime
		        int number = 29;

		        if (isPrime(number)) {
		            System.out.println(number + " is a prime number");
		        } else {
		            System.out.println(number + " is not a prime number");
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


