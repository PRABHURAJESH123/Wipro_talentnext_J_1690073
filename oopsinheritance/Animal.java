package mypack;

public class Animal {

	
		    public void eat() {
		        System.out.println("The animal is eating.");
		    }

		    // Method to simulate sleeping
		    public void sleep() {
		        System.out.println("The animal is sleeping.");
		    }

		    public static void main(String[] args) {
		        // Create an instance of Animal class
		        Animal animal = new Animal();
		        animal.eat();   // Invoke eat method
		        animal.sleep(); // Invoke sleep method

		        // Create an instance of Bird class
		        Bird bird = new Bird();
		        bird.eat();   // Invoke overridden eat method
		        bird.sleep(); // Invoke overridden sleep method
		        bird.fly();   // Invoke fly method
		    }
		}

		// Bird.java
		public class Bird extends Animal {
		    // Override the eat method
		    @Override
		    public void eat() {
		        System.out.println("The bird is pecking at some seeds.");
		    }

		    // Override the sleep method
		    @Override
		    public void sleep() {
		        System.out.println("The bird is sleeping in its nest.");
		    }

		    // New method to simulate flying
		    public void fly() {
		        System.out.println("The bird is flying.");
		    }
		


	}


