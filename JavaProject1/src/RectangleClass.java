class Rectangle {
    // Attributes
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}


public class RectangleClass {
    public static void main(String[] args) {
        // Creating an instance of the Rectangle class
        Rectangle rectangle = new Rectangle(55.0, 18.0);

        // Calculating and printing area and perimeter
        System.out.println("--- Rectangle Calculator ---");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
