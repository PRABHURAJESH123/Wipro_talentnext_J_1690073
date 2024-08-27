package mypack;


		// TODO Auto-generated method stub
		public class ArrayMinMax {
		    public static void main(String[] args) {
		        // Initialize the integer array
		        int[] intArray = {10, 20, 30, 40, 50};
		        
		        // Initialize the minimum and maximum with the first element of the array
		        int minValue = intArray[0];
		        int maxValue = intArray[0];
		        
		        // Iterate through the array to find the minimum and maximum values
		        for (int num : intArray) {
		            if (num < minValue) {
		                minValue = num;
		            }
		            if (num > maxValue) {
		                maxValue = num;
		            }
		        }
		        
		        // Print the minimum and maximum values
		        System.out.println("Minimum value in the array: " + minValue);
		        System.out.println("Maximum value in the array: " + maxValue);
		    }
		


	}


