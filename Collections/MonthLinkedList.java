package mypack;

import java.util.Iterator;
import java.util.LinkedList;

public class MonthLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//import java.util.LinkedList;
		//import java.util.Iterator;

		
		        // Create a LinkedList to store Strings (months)
		        LinkedList<String> monthsList = new LinkedList<>();

		        // Add elements to the LinkedList
		        monthsList.add("January");
		        monthsList.add("February");
		        monthsList.add("March");
		        monthsList.add("April");
		        monthsList.add("May");
		        monthsList.add("June");
		        monthsList.add("July");
		        monthsList.add("August");
		        monthsList.add("September");
		        monthsList.add("October");
		        monthsList.add("November");
		        monthsList.add("December");

		        // Print all elements using printAll method
		        printAll(monthsList);
		    }

		    // Method to print all elements of LinkedList using Iterator
		    public static void printAll(LinkedList<String> list) {
		        // Obtain an Iterator from the LinkedList
		        Iterator<String> iterator = list.iterator();

		        // Iterate through the LinkedList using Iterator and print each element
		        System.out.println("Months of the year:");
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }
		    }
		


	}


