package pl.waw.sgh.shapes;

public class Circle extends Shape {
    public Circle(double a) {
        super(a);
    }

    @Override
    public double calcSurface() {
        return Math.PI*Math.pow(parA,2);
    }
}
