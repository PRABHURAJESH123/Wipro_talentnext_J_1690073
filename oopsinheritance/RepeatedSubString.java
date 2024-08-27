package mypack;

public class RepeatedSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// RepeatedSubstring.java
		
		        // Test case
		        String inputString = "Wipro";
		        int n = 3;

		        // Call the method to generate the new string
		        String result = repeatLastNCharacters(inputString, n);

		        // Print the result
		        System.out.println(result);
		    }

		    // Method to generate the new string with n repetitions of the last n characters
		    public static String repeatLastNCharacters(String str, int n) {
		        if (str == null || str.length() < n) {
		            throw new IllegalArgumentException("String length must be greater than or equal to n.");
		        }

		        // Get the last n characters of the string
		        String lastNChars = str.substring(str.length() - n);

		        // Generate the new string with n repetitions of the last n characters
		        StringBuilder result = new StringBuilder();
		        for (int i = 0; i < n; i++) {
		            result.append(lastNChars);
		        }

		        return result.toString();
		    }
		


	}


