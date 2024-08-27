package mypack;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public class ThreadDemo {

		   // public static void main(String[] args) {
		        // Create thread objects with assigned names
		        Thread scoobyThread = new Thread(new ScoobyThread(), "Scooby");
		        Thread shaggyThread = new Thread(new ShaggyThread(), "Shaggy");

		        // Start the threads
		        scoobyThread.start();
		        shaggyThread.start();

		        // Display thread names
		        System.out.println("Thread names:");
		        System.out.println("Thread 1: " + scoobyThread.getName());
		        System.out.println("Thread 2: " + shaggyThread.getName());
		    }
		}

		// Thread classes
		class ScoobyThread implements Runnable {
		    public void run() {
		        // Define the behavior of Scooby thread
		    }
		}

		class ShaggyThread implements Runnable {
		    public void run() {
		        // Define the behavior of Shaggy thread
		    }
		


	}


