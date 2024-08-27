package mypack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCpy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		import java.io.BufferedReader;
//		import java.io.BufferedWriter;
//		import java.io.FileReader;
//		import java.io.FileWriter;
//		import java.io.IOException;

//		public class FileCopy {
//		    public static void main(String[] args) {
		        // Step 1: Read input file name and output file name from user input
		        String inputFile = "";    // Input file name to be entered by user
		        String outputFile = "";   // Output file name to be entered by user

		        try (BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in))) {
		            System.out.println("Enter the input file name:");
		            inputFile = reader.readLine().trim();

		            System.out.println("Enter the output file name:");
		            outputFile = reader.readLine().trim();
		        } catch (IOException e) {
		            System.out.println("Error reading input: " + e.getMessage());
		            return;
		        }

		        // Step 2: Copy contents from input file to output file
		        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
		             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFile))) {

		            String line;
		            while ((line = fileReader.readLine()) != null) {
		                fileWriter.write(line);
		                fileWriter.newLine(); // Add newline after each line (if desired)
		            }

		            System.out.println("File is copied.");
		        } catch (IOException e) {
		            System.out.println("Error copying file: " + e.getMessage());
		            return;
		        }
		    }
		


	}


