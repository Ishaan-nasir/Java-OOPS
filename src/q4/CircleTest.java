/**
 * 
 */
package q4;

/**
 * 
 */
class Circle {
	double radius;

	Circle() {
		this.radius = 1;
	}

	Circle(double radius) {
		this.radius = radius;
	}

	double area() {
		return Math.PI * this.radius * this.radius;
	}

	double circumference() {
		return 2 * Math.PI * this.radius;
	}

	void Display() {
		System.out.println("Radius: " + this.radius);
		System.out.println("Area: " + this.area());
		System.out.println("Circumference: " + this.circumference());
	}
}

/**
 * 
 */
public class CircleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using non-parameterized constructor (default radius = 1)
		Circle c1 = new Circle();
		c1.Display();

		// Using parameterized constructor (radius = 5.5)
		Circle c2 = new Circle(5.5);
		c2.Display();
	}

}
