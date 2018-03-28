package pl.waw.sgh;

public class ForLoop {

    public static void main(String[] args) {

        for (int i=0;i<5;i++) {
            System.out.println("i=" + i);
        }
        System.out.println();

        for (int i=6;i<7;i--) {
            if (i==3) continue;
            System.out.println("i=" + i);
            if (i==0) break;

        }

        int i = 0;
        for (i=0;i<5;i++) {
            System.out.println("i=" + i);
        }

    }
}
