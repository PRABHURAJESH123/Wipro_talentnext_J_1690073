package mypack;

public class main {

	//public static void main1(String[] args) {
		// TODO Auto-generated method stub
		public static String checkNumber(int num) {
	        if (num > 0) {
	            return "Positive";
	        } else if (num < 0) {
	            return "Negative";
	        } else {
	            return "Zero";
	        }
	    }

	    public main(String[] args) {
	        int[] numbers = {10, -5, 0};
	        for (int num : numbers) {
	            System.out.println("The number " + num + " is " + checkNumber(num));
	        }
	    
	

	}

}
