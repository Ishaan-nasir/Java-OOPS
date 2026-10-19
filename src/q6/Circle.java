package q6;

/**
 * Circle class implementing GeometricObject.
 */
public class Circle implements GeometricObject {
    // Protected attribute as specified by #radius: double = 1.0
    protected double radius = 1.0;

    /**
     * Default constructor.
     */
    public Circle() {
        this.radius = 1.0;
    }

    /**
     * Parameterized constructor.
     * @param radius radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Getter for radius.
     * @return current radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculates the perimeter (circumference) of the circle.
     * @return 2 * PI * radius
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Calculates the area of the circle.
     * @return PI * radius^2
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
