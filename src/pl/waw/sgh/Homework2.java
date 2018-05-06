package pl.waw.sgh;

//Please write a program that prints "n" elements of the Fibonacci sequence

//https://en.wikipedia.org/wiki/Fibonacci_number
//https://www.tutorialspoint.com/java/java_loop_control.htm
//https://javastart.pl/baza-wiedzy/darmowy-kurs-java/podstawy-jezyka/podstawowe-wejscie-wyjscie

//Importing scanner to let the user type "n" - up to which number of the series he wants the fibonacci sequence
import java.util.Scanner;
public class Homework2 {
    public static void main(String args[])
    {
        //Declaring initial variables. n1 and n2 have to be predefined every time.
        int n1 = 1, n2 = 1, n3 = 0;

        //Scanner module to let the user type "n"//
        System.out.println("I want to find Fibonacci Sequence up to number:");
        Scanner FiboNumber = new Scanner(System.in);
        int n = FiboNumber.nextInt();
        FiboNumber.close();
        System.out.println("\nFibonacci Sequence up to "+n+":");

        // n1 and n2 are predefined, so we type them here.//
        System.out.print("1 number: "+n1+"\n"+"2 number: "+n2+"\n");

        // And here we build a loop. It starts with 2, because we already have n1=1 n2=1, next number is 2. n3=2. //
        for(int i=2;i<n;i++)
        {
            n3 = n1+n2;
            System.out.print(i+1+" number: "+n3+"\n");
            n1=n2;
            n2=n3;
        }
    }
}
