package pl.waw.sgh.shapes;

import java.util.Map;
import java.util.HashMap;

public class MapsOfShapes {

    public static void main(String[] args) {
        Map<String, ShapeCalculation> myMap = new HashMap<>();
        myMap.put("Rect 1 ", new Rectangle(4,6));
        myMap.put("Circle 1", new Circle(4));
        myMap.put("Rect 2", new Rectangle(2,3));

        myMap.put("Rect 2", new Rectangle(666,66));

        for (String idx : myMap.keySet()) {
            ShapeCalculation s = myMap.get(idx);
            System.out.println(s);
        }

    }
}
