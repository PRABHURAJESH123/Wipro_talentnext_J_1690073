package mypack;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char firstChar = 's';
        char secondChar = 'e';

        // Display the characters in alphabetical order
        if (firstChar < secondChar) {
            System.out.println(firstChar + ", " + secondChar);
        } else {
            System.out.println(secondChar + ", " + firstChar);
        }

        // Additional examples to demonstrate the program
        char firstChar2 = 'a';
        char secondChar2 = 'e';
        if (firstChar2 < secondChar2) {
            System.out.println(firstChar2 + ", " + secondChar2);
        } else {
            System.out.println(secondChar2 + ", " + firstChar2);
        }
    }


	}


