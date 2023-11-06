/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;
import com.mycompany.oldDrawingSys.Rectangle;

/**
 *
 * @author MoaathAlrajab
 */
public class ModifiedSystem {
    public static void main(String[] args) {
        Shape[] shapes;
        shapes = new Shape[]{new CircleAdapter(new Circle()), new RectangleAdapter(new Rectangle())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, x2, y1, y2);
        }
    }
}
