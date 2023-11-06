package NewDrawingSys;

import com.mycompany.oldDrawingSys.Rectangle;
/**
 * rectangle adapter class, adds desired implementations to Rectangle class
 */
public class RectangleAdapter implements Shape
{
    //declaring a rectangle object
    private Rectangle rec;

    //parameterized constructor
    public RectangleAdapter(Rectangle rec) {
        this.rec = rec;
    }

    /**
     * overrides draw method from shape and modifies it to fit rectangle
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        rec.draw(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));

    }

}
