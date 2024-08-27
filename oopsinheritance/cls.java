class Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor to initialize the dimensions
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate and return the volume of the box
    public double volume() {
        return width * height * depth;
    }

    // Getters for the dimensions (optional)
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        // Creating an object of the Box class
        Box box = new Box(5, 10, 2);

        // Testing the functionalities
        System.out.println("Width: " + box.getWidth());
        System.out.println("Height: " + box.getHeight());
        System.out.println("Depth: " + box.getDepth());
        System.out.println("Volume: " + box.volume());
    }
}
