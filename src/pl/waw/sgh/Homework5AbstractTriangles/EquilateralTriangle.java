package pl.waw.sgh.Homework5AbstractTriangles;

public class EquilateralTriangle extends AbstractTriangle {

    public EquilateralTriangle(double a, double b, double c){
        super(a, b, c);
    }

    @Override
    public String toString() {
        return "My " + this.getClass().getSimpleName() + " [parA=" + parA + "]";
    }
}