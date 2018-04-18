package pl.waw.sgh.obj;

public class PlayWithRect {

    public static void main(String[] args) {
        //Rectangle r1 = new Rectangle();
        Rectangle r1 = new Rectangle(3,8);
        //r1.sideA = 54d;
        r1.setParams(2,4);
        double surface = r1.calcSurface();
        System.out.println(surface);
    }
}
