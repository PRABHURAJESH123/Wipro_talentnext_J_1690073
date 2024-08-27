package mypack;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] intArray = {12, 34, 12, 45, 67, 89};

		        // Convert the array to a LinkedHashSet to remove duplicates and maintain order
		        Set<Integer> set = new LinkedHashSet<>();
		        for (int num : intArray) {
		            set.add(num);
		        }

		        // Convert the set back to an array
		        Integer[] uniqueArray = set.toArray(new Integer[0]);

		        // Print the array with unique elements
		        System.out.print("Array without duplicates: ");
		        for (int num : uniqueArray) {
		            System.out.print(num + " ");
		        }
		    }
		


	}


