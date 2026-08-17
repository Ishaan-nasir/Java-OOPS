package q4;

// Class representing a Complex Number
class Complex {
    int real;
    int img;

    // Constructor
    Complex(int r, int i) {
        this.real = r;
        this.img = i;
    }
}

// Class representing an X-Y Point
class Point {
    int x;
    int y;

    // Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Class demonstrating Method Overloading for multiply()
public class MultiplyTest {

    // 1. Multiply two integers and print the result
    void multiply(int a, int b) {
        int result = a * b;
        System.out.println("1. Multiplication of two integers (" + a + " * " + b + "): " + result);
    }

    // 2. Multiply a String and an integer (repeat the string n times)
    void multiply(String str, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + str;
        }
        System.out.println("2. String repeated " + count + " times: " + result);
    }

    // 3. Multiply two complex numbers: (a + bi) * (c + di)
    // Formula: Real = (a*c - b*d), Imaginary = (a*d + b*c)
    void multiply(Complex c1, Complex c2) {
        int realPart = (c1.real * c2.real) - (c1.img * c2.img);
        int imgPart = (c1.real * c2.img) + (c1.img * c2.real);
        System.out.println("3. Product of complex numbers: " + realPart + " + " + imgPart + "i");
    }

    // 4. Translate / scale a Point by multiplying it with a factor
    void multiply(Point p, int factor) {
        int newX = p.x * factor;
        int newY = p.y * factor;
        System.out.println("4. Translated Point coordinates: (" + newX + ", " + newY + ")");
    }

    // Main method to test all overloaded multiply methods
    public static void main(String[] args) {
        MultiplyTest obj = new MultiplyTest();

        // 1. Testing two integers
        obj.multiply(5, 4);

        // 2. Testing String and integer
        obj.multiply("Hello ", 3);

        // 3. Testing two complex numbers: (2 + 3i) and (4 + 5i)
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        obj.multiply(c1, c2);

        // 4. Testing Point and translation factor: Point(3, 7) with factor 2
        Point p = new Point(3, 7);
        obj.multiply(p, 2);
    }
}
