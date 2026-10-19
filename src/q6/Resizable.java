package q6;

/**
 * Resizable interface representing objects that can be resized by a percentage.
 */
public interface Resizable {
    /**
     * Resizes the object by the specified percentage.
     * @param percent percentage to resize (e.g., 50 for 50%, 200 for 200%)
     */
    void resize(int percent);
}
