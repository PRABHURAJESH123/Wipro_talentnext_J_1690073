package mypack;

import java.util.ArrayList;

public class MonthsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//import java.util.ArrayList;

				        // Create an ArrayList to store months
		        ArrayList<String> months = new ArrayList<>();

		        // Add all the months of a year to the ArrayList
		        months.add("January");
		        months.add("February");
		        months.add("March");
		        months.add("April");
		        months.add("May");
		        months.add("June");
		        months.add("July");
		        months.add("August");
		        months.add("September");
		        months.add("October");
		        months.add("November");
		        months.add("December");

		        // Print the contents of the ArrayList
		        System.out.println("Months of the year:");
		        for (String month : months) {
		            System.out.println(month);
		        }
		    }
		

	}


