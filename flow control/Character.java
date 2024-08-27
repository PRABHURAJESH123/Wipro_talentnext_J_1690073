package mypack;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '#';

        // Check if the character is an alphabet, digit, or special character
        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }

	private static boolean isDigit(char ch) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean isLetter(char ch) {
		// TODO Auto-generated method stub
		return false;
	}

	}


