package pl.waw.sgh.Homework5AbstractTriangles;

//Please create new shapes based on the pl.waw.sgh.shapes.Shape class.
//1. Create an abstract AbstractTriangle class
//2. Create classes that extend the AbstractTriangle:
//- Equilateral Triangle
//- Isosceles Triangle
//- Scalene Triangle
//(https://www.mathsisfun.com/triangle.html)
//3. Add implmentation of calcSurface for all triangles.
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

    public AbstractTriangle (double a, double b, double c) {
        setTParams(a, b, c);
    }

    public AbstractTriangle (double a) {
        setTEParams(a);
    }


    public void setTParams(double a, double b, double c) {
        parA = a;
        parB = b;
        parC = c;
    }

    public void setTEParams(double a) {
        parA = a;
        parB = a;
        parC = a;
    }

    public abstract double calcSurface();


}
