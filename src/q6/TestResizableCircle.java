package q6;

/**
 * Driver/Test class to verify the GeometricObject and Resizable hierarchy.
 */
public class TestResizableCircle {
    public static void main(String[] args) {
        System.out.println("=== Testing Circle (implements GeometricObject) ===");
        Circle circle = new Circle(10.0);
        System.out.println("Object: " + circle);
        System.out.println("Radius: " + circle.getRadius());
        System.out.printf("Perimeter: %.2f%n", circle.getPerimeter());
        System.out.printf("Area: %.2f%n", circle.getArea());

        System.out.println("\n=== Testing ResizableCircle (extends Circle, implements Resizable) ===");
        ResizableCircle resizableCircle = new ResizableCircle(20.0);
        System.out.println("Initial: " + resizableCircle);
        System.out.println("Initial Radius: " + resizableCircle.getRadius());
        System.out.printf("Initial Perimeter: %.2f%n", resizableCircle.getPerimeter());
        System.out.printf("Initial Area: %.2f%n", resizableCircle.getArea());

        // Resizing to 50%
        System.out.println("\n--- Resizing by 50% ---");
        resizableCircle.resize(50);
        System.out.println("After resize(50): " + resizableCircle);
        System.out.println("New Radius: " + resizableCircle.getRadius());
        System.out.printf("New Perimeter: %.2f%n", resizableCircle.getPerimeter());
        System.out.printf("New Area: %.2f%n", resizableCircle.getArea());

        // Resizing by 200% (doubling the current size)
        System.out.println("\n--- Resizing by 200% ---");
        resizableCircle.resize(200);
        System.out.println("After resize(200): " + resizableCircle);
        System.out.println("New Radius: " + resizableCircle.getRadius());
        System.out.printf("New Perimeter: %.2f%n", resizableCircle.getPerimeter());
        System.out.printf("New Area: %.2f%n", resizableCircle.getArea());

        // Demonstrating Interface Polymorphism
        System.out.println("\n=== Interface Polymorphism Demonstration ===");
        GeometricObject geomObj = new Circle(5.0);
        System.out.printf("GeometricObject (Circle) Area: %.2f%n", geomObj.getArea());

        GeometricObject geomResizable = new ResizableCircle(5.0);
        System.out.printf("GeometricObject (ResizableCircle) Area: %.2f%n", geomResizable.getArea());

        Resizable resizable = (Resizable) geomResizable;
        resizable.resize(80);
        System.out.printf("After resizing to 80%%, Area: %.2f%n", geomResizable.getArea());
    }
}
