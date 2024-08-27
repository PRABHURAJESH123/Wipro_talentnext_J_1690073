package mypack;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StringArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//import java.util.ArrayList;
		//import java.util.Iterator;

		
		        // Create an ArrayList to store Strings
		        ArrayList<String> stringList = new ArrayList<>();

		        // Add elements to the ArrayList
		        stringList.add("Apple");
		        stringList.add("Banana");
		        stringList.add("Orange");
		        stringList.add("Mango");

		        // Print all elements using printAll method
		        printAll(stringList);
		    }

		    // Method to print all elements of ArrayList using Iterator
		    public static void printAll(ArrayList<String> list) {
		        // Obtain an Iterator from the ArrayList
		        Iterator iterator = (Iterator) list.iterator();

		        // Iterate through the ArrayList using Iterator and print each element
		        System.out.println("Elements in the ArrayList:");
		        //while (iterator.next()) {
		            System.out.println();
		        }
		    
		


	}


