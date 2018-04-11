package pl.waw.sgh;

public class Bowls {

    public static void main(String[] args) {

        int n = 2000000;
        long sum = 0;
        long startTime = System.currentTimeMillis();

        for (int i=0;i<=n;i++) {
            sum = sum + i;  // sum += i;
        }
        System.out.println(sum);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime-startTime + " ms");
    }
}
