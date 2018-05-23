package pl.waw.sgh.Homework5AbstractTriangles;

//Please create new shapes based on the pl.waw.sgh.shapes.Shape class.
//1. Create an abstract AbstractTriangle class
//2. Create classes that extend the AbstractTriangle:
//- Equilateral Triangle
//- Isosceles Triangle
//- Scalene Triangle
//(https://www.mathsisfun.com/triangle.html)
//3. Add implementation of calcSurface for all triangles.
//Note, you can put the common part of the implementation in the AbstractTriangle.

//Notes about abstracts:
//https://javastart.pl/baza-wiedzy/darmowy-kurs-java/programowanie-obiektowe/klasy-abstrakcyjne
//https://www.javatpoint.com/abstract-class-in-java
//https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
//https://www.tutorialspoint.com/java/java_abstraction.htm

public abstract class AbstractTriangle {
    protected Double parA = 0d;
    protected Double parB = 0d;
    protected Double parC = 0d;

    public AbstractTriangle (double a, double b, double c) { //constructor of scalene traingle
        set3Params(a, b, c);
    }

    public void set3Params(double a, double b, double c) {
        parA = a;
        parB = b;
        parC = c;
    }

    //https://www.wikihow.com/Calculate-the-Area-of-a-Triangle
    public double calcSurface() {
        double p = (parA+parB+parC)/2;
        return Math.sqrt(p*(p-parA)*(p-parB)*(p-parC));
    }
}