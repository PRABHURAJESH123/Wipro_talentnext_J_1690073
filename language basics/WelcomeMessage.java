package mypack;

public class WelcomeMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
            System.out.println("Usage: java WelcomeMessage <name>");
            return;
        }
        
        // Read the command-line argument
        String name = args[0];
        
        // Print the welcome message
        System.out.println("Welcome, " + name + "!");
    }

	}


