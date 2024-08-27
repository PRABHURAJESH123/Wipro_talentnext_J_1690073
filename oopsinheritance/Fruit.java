package mypack;

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fruit.java
		
		    private String name;
		    private String taste;
		    private String size;

		    // Constructor to initialize the attributes
		    public Fruit(String name, String taste, String size) {
		        this.name = name;
		        this.taste = taste;
		        this.size = size;
		    }

		    // Method to describe the name of the fruit and its taste
		    public void eat() {
		        System.out.println("This is a " + name + " and it tastes " + taste + ".");
		    }

		    // Getters for the attributes (if needed)
		    public String getName() {
		        return name;
		    }

		    public String getTaste() {
		        return taste;
		    }

		    public String getSize() {
		        return size;
		    }

		    // Setters for the attributes (if needed)
		    public void setName(String name) {
		        this.name = name;
		    }

		    public void setTaste(String taste) {
		        this.taste = taste;
		    }

		    public void setSize(String size) {
		        this.size = size;
		    }
		


	}


