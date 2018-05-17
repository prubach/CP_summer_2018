package pl.waw.sgh.Homework5AbstractTriangles;

public class EquilateralTriangle extends AbstractTriangle {

    public EquilateralTriangle(double a) {
        super(a);
    }

    @Override
    public double calcSurface() {
        return parA * parA * Math.sqrt(3) * 0.25;
    }

    @Override
    public String toString() {
        return "My " + super.toString();
    }
}