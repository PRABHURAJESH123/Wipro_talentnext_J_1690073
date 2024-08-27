package mypack;

import java.util.Enumeration;
import java.util.Vector;

public class MonthsVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//import java.util.Vector;
		//import java.util.Enumeration;

		
		        // Create a Vector to store Strings (months)
		        Vector<String> monthsVector = new Vector<>();

		        // Add elements to the Vector
		        monthsVector.add("January");
		        monthsVector.add("February");
		        monthsVector.add("March");
		        monthsVector.add("April");
		        monthsVector.add("May");
		        monthsVector.add("June");
		        monthsVector.add("July");
		        monthsVector.add("August");
		        monthsVector.add("September");
		        monthsVector.add("October");
		        monthsVector.add("November");
		        monthsVector.add("December");

		        // Print all elements using printAll method
		        printAll(monthsVector);
		    }

		    // Method to print all elements of Vector using Enumeration
		    public static void printAll(Vector<String> vector) {
		        // Obtain an Enumeration from the Vector
		        Enumeration<String> enumeration = vector.elements();

		        // Iterate through the Vector using Enumeration and print each element
		        System.out.println("Months of the year:");
		        while (enumeration.hasMoreElements()) {
		            System.out.println(enumeration.nextElement());
		        }
		    }
		


	}


