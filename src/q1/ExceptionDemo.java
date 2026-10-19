package q1;

public class ExceptionDemo {

    // Helper method to demonstrate IllegalArgumentException
    static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {

        // a) ArithmeticException (dividing an integer by zero)
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("a) ArithmeticException caught: Cannot divide by zero");
        }

        // b) ArrayIndexOutOfBoundsException (accessing index that doesn't exist)
        try {
            int[] arr = {1, 2, 3};
            int val = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("b) ArrayIndexOutOfBoundsException caught: Array index out of range");
        }

        // c) NumberFormatException (converting invalid string to integer)
        try {
            int num = Integer.parseInt("hello");
        } catch (NumberFormatException e) {
            System.out.println("c) NumberFormatException caught: Cannot convert non-number string to int");
        }

        // d) NullPointerException (calling method on null object)
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("d) NullPointerException caught: Object is null");
        }

        // e) IllegalArgumentException (passing illegal/inappropriate argument)
        try {
            checkAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("e) IllegalArgumentException caught: " + e.getMessage());
        }
    }
}
