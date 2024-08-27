package mypack;

public class Author {

	
		
		    private String name;
		    private String email;
		    private char gender;

		    // Parameterized constructor to initialize the variables
		    public Author(String name, String email, char gender) {
		        this.name = name;
		        this.email = email;
		        this.gender = gender;
		    }

		    // Getters
		    public String getName() {
		        return name;
		    }

		    public String getEmail() {
		        return email;
		    }

		    public char getGender() {
		        return gender;
		    }

		    // Setters
		    public void setName(String name) {
		        this.name = name;
		    }

		    public void setEmail(String email) {
		        this.email = email;
		    }

		    public void setGender(char gender) {
		        this.gender = gender;
		    }

		    // Override toString method to print author details
		    @Override
		    public String toString() {
		        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
		    }
		}

		// Book.java
		class Book {
		    private String name;
		    private Author author;
		    private double price;
		    private int qtyInStock;

		    // Parameterized constructor to initialize the variables
		    public Book(String name, Author author, double price, int qtyInStock) {
		        this.name = name;
		        this.author = author;
		        this.price = price;
		        this.qtyInStock = qtyInStock;
		    }

		    // Getters
		    public String getName() {
		        return name;
		    }

		    public Author getAuthor() {
		        return author;
		    }

		    public double getPrice() {
		        return price;
		    }

		    public int getQtyInStock() {
		        return qtyInStock;
		    }

		    // Setters
		    public void setName(String name) {
		        this.name = name;
		    }

		    public void setAuthor(Author author) {
		        this.author = author;
		    }

		    public void setPrice(double price) {
		        this.price = price;
		    }

		    public void setQtyInStock(int qtyInStock) {
		        this.qtyInStock = qtyInStock;
		    }

		    // Override toString method to print book details
		    @Override
		    public String toString() {
		        return "Book[name=" + name + ", " + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
		    }

		    // Main method to test the functionalities
		    public static void main(String[] args) {
		        // Create an Author object
		        Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');

		        // Create a Book object
		        Book book = new Book("Harry Potter", author, 29.99, 100);

		        // Print the details of the book including the author details
		        System.out.println(book);
		    }
		


	}


