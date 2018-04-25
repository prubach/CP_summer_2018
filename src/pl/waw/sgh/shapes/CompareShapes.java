package pl.waw.sgh.shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareShapes {

    public static void main(String[] args) {
        Shape s1 = new Rectangle(5,4);
        Shape s2 = new Circle(4);
        Shape s3 = new Rectangle(5,6);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(s1);
        shapeList.add(s2);
        shapeList.add(s3);

        for (Shape s : shapeList) {
            System.out.println(s);
        }
        System.out.println();

        Collections.sort(shapeList);

        for (int i=0;i<shapeList.size();i++) {
            Shape s = shapeList.get(i);
            System.out.println(s.toString());
            System.out.println(s.calcSurface());
        }


    }
}
