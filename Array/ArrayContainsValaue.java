package mypack;

import java.util.Scanner;

public class ArrayContainsValaue {


		    public static void main(String[] args) {
		        // Initialize the integer array
		        int[] intArray = {10, 20, 30, 40, 50};
		        
		        // Create a Scanner object to read input from the user
		        Scanner scanner = new Scanner(System.in);
		        
		        // Prompt the user to enter a number to check
		        System.out.print("Enter a number to check if it is present in the array: ");
		        int numberToCheck = scanner.nextInt();
		        
		        // Variable to track if the number is found
		        boolean isFound = false;
		        
		        // Iterate through the array to check if the number is present
		        for (int num : intArray) {
		            if (num == numberToCheck) {
		                isFound = true;
		                break;
		            }
		        }
		        
		        // Print the result
		        if (isFound) {
		            System.out.println("The number " + numberToCheck + " is present in the array.");
		        } else {
		            System.out.println("The number " + numberToCheck + " is not present in the array.");
		        }
		        
		        // Close the scanner
		        scanner.close();
		    }
		


	}


