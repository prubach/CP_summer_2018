package pl.waw.sgh;

public class BowlsRecurs {

    public static long sumBowls(long row) {
        if (row==1) return 1;
        else return sumBowls(row-1) + row;
    }

    public static void main(String[] args) {
        int n = 10000;
        long startTime = System.currentTimeMillis();
        System.out.println(sumBowls(n));
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime-startTime + " ms");
    }

}
