package pl.waw.sgh;

public class Switch {

    // constant
    private final static String CONST_A = "A";
    private final static String CONST_B = "B";
    private final static String CONST_C = "C";

    public static void main(String[] args) {

        //CONST = "B";
        String s = "DDDD";

        switch (s) {
            case CONST_A:
                System.out.println("s is A");
                break;
            case CONST_B:
                System.out.println("s is B");
                System.out.println("sdgsgsg");
            case CONST_C:
                System.out.println("s is C");
                break;
            default:
                System.out.println("s is not A or B or C");

        }

    }
}
