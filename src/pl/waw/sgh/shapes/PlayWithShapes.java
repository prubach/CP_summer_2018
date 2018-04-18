package pl.waw.sgh.shapes;

public class PlayWithShapes {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        //Rectangle r1 = new Rectangle();
        //r1.setParams(4,5);
        System.out.println(r1.calcSurface());
    }
}
