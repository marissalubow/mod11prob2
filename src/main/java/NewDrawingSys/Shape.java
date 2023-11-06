package NewDrawingSys;

/**
 * interface shape for other classes to implement
 */

public interface Shape
{
    /**
     * abstract method draw takes 4 parameters, other classes will implement
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     */
    void draw(int x1, int x2, int y1, int y2);
}
