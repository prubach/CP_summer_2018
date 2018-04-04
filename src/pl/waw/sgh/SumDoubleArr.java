package pl.waw.sgh;

import java.text.ParseException;

public class SumDoubleArr {

    public static double sumDoubles(double[] array) {
        double sum = 0;
        for (double el : array) {
            sum += el; // sum = sum + el;  -=   sum = sum - el
        }
        return sum;
    }

    public static void main(String[] args) {
        //double[] arr = new double[] { 5435, 54.44, 25225.25 };
        double[] dArr = new double[args.length];
        for (int i=0;i<args.length;i++) {
            try {
                dArr[i] = Double.parseDouble(args[i]);
            } catch (NumberFormatException ne) {
                System.out.println("Argument " + i + " was ignored!");
            }
        }
        double sum = sumDoubles(dArr);
        System.out.println(sum);
    }
}
