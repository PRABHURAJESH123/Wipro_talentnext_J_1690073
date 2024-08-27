
public class Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor to initialize the dimensions
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate the volume of the box
    public double getVolume() {
        return width * height * depth;
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        // Creating an object of the Box class
        Box myBox = new Box(10.5, 5.5, 7.5);

        // Printing the dimensions of the box
        System.out.println("Width: " + myBox.width);
        System.out.println("Height: " + myBox.height);
        System.out.println("Depth: " + myBox.depth);

        // Calculating and printing the volume of the box
        double volume = myBox.getVolume();
        System.out.println("Volume of the box: " + volume);
    }
}
