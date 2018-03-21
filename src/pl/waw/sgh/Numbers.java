package pl.waw.sgh;

import java.util.Date;

public class Numbers {

    // psvm
    /*

    Comment
     */
    public static void main(String[] args) {
        int b;
        b = 7;
        int a = 4;

        int c = a + b;

        Integer aa = a;
        aa = 5656*a;
        // + - * /
        int a1 = b % a;
        System.out.println("a1=" + a1);
        // add 1 to a1
        a1++;
        // subtract 1 from a1
        a1--;

        //int a2 = a1++;
        int a2 = ++a1;

        System.out.println("a2=" + a2);

        Float f1 = 353.5f;
        Double d1 = 755.6d;

        //Float f2 = f1 + d1;
        Double d2 = f1 + d1;

        Long l1 = 54L;
        int i1 = 35234;
        //Integer i2 = i1 + l1;
        long l2 = i1 + l1;
        byte b1 = 56;
        short s1 = 342;
        long l3 = b1 * s1;

        // Long.valueOf(l2) - convert from long to Long
        int i3 = Long.valueOf(l2).intValue();
        int i4 = l1.intValue();

        long l4 = 295957927519279766L;
        System.out.println("l4=" + l4);
        int i5 = Long.valueOf(l4).intValue();
        System.out.println("i5=" + i5);

        Date curDate = new Date();
        System.out.println(System.currentTimeMillis());
        System.out.println(curDate);

        Double dd = 5.367347*1e12;

        Long dd2 = Math.round(dd);

        System.out.println(dd);
        System.out.println(dd2);

        double dd4 = Math.pow(2.0,4.0);
        //Math.











    }
}
