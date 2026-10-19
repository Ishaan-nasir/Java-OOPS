package q4;

/**
 * Represents a 2D point with x and y coordinates.
 */
public class Point2D {
    // Private attributes
    private float x = 0.0f;
    private float y = 0.0f;

    // Default constructor
    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Parameterized constructor
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[] { this.x, this.y };
    }

    public String toString() {
        return "(" + this.x + ","+ this.y + ")";
    }
}
