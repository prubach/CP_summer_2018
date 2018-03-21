package pl.waw.sgh;

public class Conditions {

    // Global variable
    public static int myInt = 7;

    public static void main(String[] args) {
        int a =5;
        {
            int b = 6;
            System.out.println(a);
            System.out.println(b);
            {
                System.out.println(a);
                System.out.println(b);
            }
        }
        System.out.println(a);
        //System.out.println(b);

        if (a == 5) {
            int c = 7;
            System.out.println("a=5");
        } else if (a == 6) {
            System.out.println("a = 6");
        } else {
            System.out.println("a is not 5 and is not 6");
        }

        int c = a == 5 ? 10 : 0;
        // equivalent
        if (a == 5) {
            c = 10;
        } else {
            c = 0;
        }



        //System.out.println(c);

    }
}
