package pl.waw.sgh.obj;

public class Rectangle {

    private Double sideA = 0d;
    private Double sideB = 0d;

/*    public Rectangle() {
        sideA = 5;
        sideB = 7;
    }*/

    public Rectangle(double sideA, double sideB) {
        setParams(sideA, sideB);
/*
        this.sideA = sideA;
        this.sideB = sideB;
*/
    }

    public void setParams(double a, double b) {
        sideA = a;
        sideB = b;
    }

    public double calcSurface() {
        return sideA*sideB;
    }
}
