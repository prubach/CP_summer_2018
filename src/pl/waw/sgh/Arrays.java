package pl.waw.sgh;

public class Arrays {

    public static void main(String[] args) {

        //int[] iArr = new int[5];
        Integer[] iArr = new Integer[5];
        iArr[0] = 32;
        iArr[1] = 665;
        iArr[2] = 8987;

        for (int i=0; i<iArr.length; i++) {
            System.out.println("element at i " + i + " = " + iArr[i]);
        }
        System.out.println();
        // for each
        for (Integer el : iArr) {
            System.out.println("El: " + el);
        }

    }
}
