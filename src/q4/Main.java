package q4;

public class Main {
    public static void main(String[] args) {
        // Testing Point2D
        System.out.println("--- Testing Point2D ---");

        Point2D p2 = new Point2D();
        System.out.println("Default 2D Point: " + p2);

        Point2D p2Custom = new Point2D(3.5f, 4.5f);
        System.out.println("Parameterized 2D Point: " + p2Custom);

        System.out.println("getX: " + p2Custom.getX());
        p2Custom.setX(7.0f);
        System.out.println("After setX(7.0): " + p2Custom);

        System.out.println("getY: " + p2Custom.getY());
        p2Custom.setY(8.0f);
        System.out.println("After setY(8.0): " + p2Custom);

        p2Custom.setXY(1.5f, 2.5f);
        System.out.println("After setXY(1.5, 2.5): " + p2Custom);

        float[] xy = p2Custom.getXY();
        System.out.println("getXY: [" + xy[0] + ", " + xy[1] + "]");
        System.out.println("toString: " + p2Custom.toString());

        // Testing Point3D
        System.out.println("\n--- Testing Point3D ---");

        Point3D p3 = new Point3D();
        System.out.println("Default 3D Point: " + p3);

        Point3D p3Custom = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Parameterized 3D Point: " + p3Custom);

        System.out.println("Inherited getX: " + p3Custom.getX());
        p3Custom.setX(4.0f);
        System.out.println("After setX(4.0): " + p3Custom);

        System.out.println("Inherited getY: " + p3Custom.getY());
        p3Custom.setY(5.0f);
        System.out.println("After setY(5.0): " + p3Custom);

        System.out.println("getZ: " + p3Custom.getZ());
        p3Custom.setZ(6.0f);
        System.out.println("After setZ(6.0): " + p3Custom);

        p3Custom.setXY(10.0f, 20.0f);
        System.out.println("After setXY(10.0, 20.0): " + p3Custom);

        p3Custom.setXYZ(1.1f, 2.2f, 3.3f);
        System.out.println("After setXYZ(1.1, 2.2, 3.3): " + p3Custom);

        float[] p3xy = p3Custom.getXY();
        System.out.println("Inherited getXY: [" + p3xy[0] + ", " + p3xy[1] + "]");

        float[] xyz = p3Custom.getXYZ();
        System.out.println("getXYZ: [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");

        System.out.println("toString: " + p3Custom.toString());
    }
}
