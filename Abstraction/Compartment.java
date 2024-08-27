package mypack;

public abstract class Compartment {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Compartment.java
//		abstract class Compartment {
		    public abstract String notice();
		 // FirstClass.java
		    class FirstClass extends Compartment {
		        @Override
		        public String notice() {
		            return "This is a First Class compartment.";
		        }
		    }

		


	}


