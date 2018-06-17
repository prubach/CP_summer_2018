package pl.waw.sgh.Homework5AbstractTriangles;

public class PlayWithTriangle {

    public static void main(String[] args) {

        AbstractTriangle[] myTriangles = new AbstractTriangle[3];
        myTriangles[0] = new ScaleneTriangle(3, 4, 5);
        myTriangles[1] = new IsoscelesTriangle(3, 4, 4);
        myTriangles[2] = new EquilateralTriangle(3, 3, 3);

        for (AbstractTriangle t : myTriangles) {
            System.out.println(t.toString());
            System.out.println("Surface: " + t.calcSurface());
        }
    }
}