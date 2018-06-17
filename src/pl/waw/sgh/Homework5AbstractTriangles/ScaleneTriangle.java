package pl.waw.sgh.Homework5AbstractTriangles;

public class ScaleneTriangle extends AbstractTriangle {

    public ScaleneTriangle(double a, double b, double c){
        super(a, b, c);
    }

    @Override
    public String toString() {
        return "My " + this.getClass().getSimpleName() + " [parA=" + parA + ", parB=" + parB +", parC="+parC+"]";
    }
}