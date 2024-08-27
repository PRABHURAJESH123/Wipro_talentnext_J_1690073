package mypack;

public class StringProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
            System.out.println("Usage: java StringProcessor <string1> <string2>");
            return;
        }
        
        // Read the command-line arguments
        String str1 = args[0];
        String str2 = args[1];
        
        // Generate and print the output formats
        generateOutputFormat(str1, str2);
    }
    
    public static void generateOutputFormat(String str1, String str2) {
        // Format 1: Concatenation of two strings
        String concatenated = str1 + str2;
        
        // Format 2: Length of each string
        int lenStr1 = str1.length();
        int lenStr2 = str2.length();
        
        // Format 3: Comparison of two strings
        String comparison = str1.equals(str2) ? "Strings are equal." : "Strings are not equal.";
        
        // Print the results
        System.out.println("Concatenated string: " + concatenated);
        System.out.println("Length of string 1 (" + str1 + "): " + lenStr1);
        System.out.println("Length of string 2 (" + str2 + "): " + lenStr2);
        System.out.println("Comparison: " + comparison);
    }


	}


