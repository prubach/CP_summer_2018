package pl.waw.sgh.shapes;

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
    }
}
