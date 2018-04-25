package pl.waw.sgh.shapes;

import java.util.HashSet;
import java.util.Set;

public class SetsOfShapes {

    public static void main(String[] args) {
        ShapeCalculation s1 = new Rectangle(5,4);
        ShapeCalculation s2 = new Circle(4);
        ShapeCalculation s3 = new Rectangle(5,6);


        Set<ShapeCalculation> shapeSet = new HashSet<>();

        shapeSet.add(s1);
        shapeSet.add(s2);
        shapeSet.add(s3);
        shapeSet.add(s2);

        for (ShapeCalculation s : shapeSet) {
            System.out.println(s);
        }

    }

}
