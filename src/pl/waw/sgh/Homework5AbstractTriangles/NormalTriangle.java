package pl.waw.sgh.Homework5AbstractTriangles;

public class NormalTriangle extends AbstractTriangle {

    public NormalTriangle(double a, double b, double c) {
        super(a,b,c);
    }

    @Override
    public double calcSurface() {
        double p = (parA + parB + parC)/2;
        return Math.sqrt(p*(p-parA)*(p-parB)*(p-parC));
    }

    @Override
    public String toString() {
        return "My " + super.toString();
    }
}