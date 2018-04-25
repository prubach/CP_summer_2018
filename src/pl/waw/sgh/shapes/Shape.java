package pl.waw.sgh.shapes;

public abstract class Shape implements ShapeCalculation {
    protected Double parA = 0d;
    protected Double parB = 0d;

    public Shape(double a, double b) {
        setParams(a, b);
    }

    public Shape(double a) {
        setParam(a);
    }

    public void setParam(double a) {
        parA = a;
    }

    public void setParams(double a, double b) {
        parA = a;
        parB = b;
    }

    public abstract double calcSurface();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [parA=" + parA + ", parB=" + parB + "]";
                //+ super.toString();
    }


}
