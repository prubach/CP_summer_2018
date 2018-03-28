package pl.waw.sgh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

        int age = 0;
        //int age = scanner.nextInt();
        boolean success = false;

        while (success!=true) {  // while (!success)
            try {
                System.out.print("Please give your age: ");
                scanner = new Scanner(System.in);
                age = scanner.nextInt();
                success = true;
            } catch (InputMismatchException ie) {
                System.out.println("Please try again!");
            }
        }
        System.out.println("age: " + age);

    }
}
