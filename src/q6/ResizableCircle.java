package q6;

/**
 * ResizableCircle class extending Circle and implementing Resizable.
 */
public class ResizableCircle extends Circle implements Resizable {

    /**
     * Parameterized constructor invoking the superclass constructor.
     * @param radius radius of the resizable circle
     */
    public ResizableCircle(double radius) {
        // Base class constructor invoked using super keyword
        super(radius);
    }

    /**
     * Resizes the radius by multiplying with the given percentage.
     * @param percent percentage to scale the radius (e.g., 50 reduces by half, 150 increases by 1.5x)
     */
    @Override
    public void resize(int percent) {
        this.radius *= (percent / 100.0);
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
}
