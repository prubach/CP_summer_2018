package pl.waw.sgh.obj;

public class Rectangle {

    Double sideA = 0d;
    Double sideB = 0d;

/*    public Rectangle() {
        sideA = 5;
        sideB = 7;
    }*/

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    void setParams(double a, double b) {
        sideA = a;
        sideB = b;
    }

    double calcSurface() {
        return sideA*sideB;
    }
}
