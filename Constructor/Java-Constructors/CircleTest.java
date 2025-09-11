class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Constructor chaining: call parameterized constructor with default value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    public void displayCircle() {
        System.out.println("Radius: " + radius);
        System.out.println("Area  : " + getArea());
    }
}

public class CircleTest {
    public static void main(String[] args) {
        // Using default constructor
        Circle circle1 = new Circle();
        System.out.println("Circle with default radius:");
        circle1.displayCircle();

        System.out.println();

        // Using parameterized constructor
        Circle circle2 = new Circle(5.5);
        System.out.println("Circle with user-provided radius:");
        circle2.displayCircle();
    }
}
