package pl.waw.sgh;

public class Booleans {

    public static void main(String[] args) {

        boolean p = true;
        boolean q = false;

        // AND
        boolean res = p && q;
        // OR
        boolean res1 = p || q;
        // XOR
        boolean res2 = p ^ q;
        // Negation
        boolean res3 = !res2;

        res3 = !(p ^ q);

        System.out.println("res=" + res);
        System.out.println("res1=" + res1);
        System.out.println("res2=" + res2);

        if (res1==true) {
            System.out.println("res1 is true");
        }

    }
}
