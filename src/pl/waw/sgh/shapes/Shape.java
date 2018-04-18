package pl.waw.sgh.shapes;

public class Shape {
    protected Double parA = 0d;
    protected Double parB = 0d;

    public Shape(double a, double b) {
        setParams(a, b);
    }

    public void setParams(double a, double b) {
        parA = a;
        parB = b;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [parA=" + parA + ", parB=" + parB + "]";
                //+ super.toString();
    }


}
