package mypack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCharacterCounters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		import java.io.BufferedReader;
//		import java.io.FileReader;
//		import java.io.IOException;
//
//		public class FileCharacterCounter {
//		    public static void main(String[] args) {
		        // Step 1: Read file name and character from user input
		        String fileName = "";  // File name to be entered by user
		        char charToCount = '\0';  // Character to count occurrences of

		        try (BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in))) {
		            System.out.println("Enter the file name:");
		            fileName = reader.readLine().trim();

		            System.out.println("Enter the character to be counted (case insensitive):");
		            String inputChar = reader.readLine().trim();
		            charToCount = inputChar.toLowerCase().charAt(0);  // Convert to lower case and get first character
		        } catch (IOException e) {
		            System.out.println("Error reading input: " + e.getMessage());
		            return;
		        }

		        // Step 2: Count occurrences of the character in the file
		        int count = 0;
		        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
		            int c;
		            while ((c = fileReader.read()) != -1) {
		                char currentChar = Character.toLowerCase((char) c);
		                if (currentChar == charToCount) {
		                    count++;
		                }
		            }
		        } catch (IOException e) {
		            System.out.println("Error reading file: " + e.getMessage());
		            return;
		        }

		        // Step 3: Display the result
		        System.out.printf("File '%s' has %d instances of letter '%c'.%n", fileName, count, charToCount);
		    }
		}


	}

}
