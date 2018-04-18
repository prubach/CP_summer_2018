package pl.waw.sgh.shapes;

import org.w3c.dom.css.Rect;

public class PlayWithShapes {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        //Rectangle r1 = new Rectangle();
        //r1.setParams(4,5);
        System.out.println(r1.calcSurface());
        // calls toString automatically
        System.out.println(r1);

        Circle c1 = new Circle(4);
        System.out.println(c1);
        System.out.println(c1.calcSurface());

        // Impossible because Shape is abstract
        //Shape s1 = new Shape(3,23);
        //System.out.println(s1);
        System.out.println();

        Shape[] myShapes = new Shape[3];
        myShapes[0] = new Rectangle(3,4);
        myShapes[1] = new Circle(5);
        myShapes[2] = new Rectangle(6,7);

        for (Shape s : myShapes) {
            System.out.println(s.toString());
            // Avoid using instanceof and casting
            //if (s instanceof Rectangle)
            //    System.out.println("Surface: " + ((Rectangle)s).calcSurface() );
            System.out.println("Surface: " + s.calcSurface());
        }


    }
}
