package mypack;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Check if exactly one argument (number) is passed
		        if (args.length != 1) {
		            System.out.println("Usage: java PalindromeCheck <number>");
		            return;
		        }

		        // Read the number from command-line argument
		        String inputNumberStr = args[0];

		        // Check if the number is a palindrome
		        boolean isPalindrome = checkPalindrome(inputNumberStr);

		        // Output the result
		        if (isPalindrome) {
		            System.out.println(inputNumberStr + " is a palindrome");
		        } else {
		            System.out.println(inputNumberStr + " is not a palindrome");
		        }
		    }

		    // Method to check if a string representation of a number is a palindrome
		    public static boolean checkPalindrome(String str) {
		        int left = 0;
		        int right = str.length() - 1;

		        // Compare characters from both ends moving towards the center
		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                return false; // Not a palindrome
		            }
		            left++;
		            right--;
		        }
		        return true; // Palindrome
		    }
		


	}


