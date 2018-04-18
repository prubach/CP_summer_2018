package pl.waw.sgh.shapes;

public class Rectangle extends Shape {

    public Rectangle() {
        // call superclass (Shape) constructor
        super(1,2);
    }

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }


    public double calcSurface() {
        return parA*parB;
    }
}
