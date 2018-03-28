package pl.waw.sgh;

public class WhileLoop {

    public static void main(String[] args) {

        int j = 2;

        while (j < 8) {
            System.out.println("j=" + j);
            j++;
        }
        System.out.println();

        Integer k = 9;
        do {
            System.out.println("k=" + k);
            k++;
        } while (k <= 5);

    }
}
