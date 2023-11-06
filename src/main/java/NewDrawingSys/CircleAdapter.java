package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;
/**
 * circle adapter class, adds desired implementations to circle class
 */
public class CircleAdapter implements Shape
{
    //declaring circle object
    private Circle circ;

    //parameterized constructor
    public CircleAdapter(Circle circ){
        this.circ = circ;
    }

    /**
     * Overrides draw method from Shape and modifies it to fit circle
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2){
        circ.draw(x1, y1, (int) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));

    }
}
