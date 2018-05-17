package pl.waw.sgh.Homework5AbstractTriangles;

public class PlayWithTriangle {

    public static void main(String[] args) {

        NormalTriangle nt1 = new NormalTriangle(3,4, 5);
        System.out.println(nt1);
        System.out.println(nt1.calcSurface());

        System.out.println();

        EquilateralTriangle et1 = new EquilateralTriangle(10);
        System.out.println(et1);
        System.out.println(et1.calcSurface());

    }
}