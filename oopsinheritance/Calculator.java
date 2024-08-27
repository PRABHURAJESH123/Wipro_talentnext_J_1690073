package mypack;

public class Calculator {

	
		
		    
		    // Static method to calculate power for int inputs
		    public static int powerInt(int num1, int num2) {
		        return (int) Math.pow(num1, num2);
		    }

		    // Static method to calculate power for double and int inputs
		    public static double powerDouble(double num1, int num2) {
		        return Math.pow(num1, num2);
		    }

		    // Main method to test the functionalities
		    public static void main(String[] args) {
		        // Testing powerInt method
		        int resultInt = Calculator.powerInt(2, 3);
		        System.out.println("2 to the power of 3 (int): " + resultInt);

		        // Testing powerDouble method
		        double resultDouble = Calculator.powerDouble(2.5, 3);
		        System.out.println("2.5 to the power of 3 (double): " + resultDouble);
		    }
		


	}


