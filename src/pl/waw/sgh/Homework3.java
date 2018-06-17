package pl.waw.sgh;

//Please write a program that checks the Tick Tack Toe game table provided
//as input in form of a text (CSV) file (ticktacktoe.txt).
//The program should print if the game is over and if so who one (X,O or nobody).
//Hints:
//1. It will simplify code if you use 1 and -1 to represent the X and O respectively
//and 0 to represent an empty field.
//2. You may need to parse the values read from the file as text (String) into numbers.
//To do that use:
//String s = "55";
//int a = Integer.parseInt(s);

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework3 {

    final static String FILE;

    static {
        //here we put file path. NOTE: maybe try to use scanner? to let the user type in the path?
        FILE = "C:\\ticktacktoe.csv";
    }

    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        File ticktacktoe = new File(FILE);

        try {
            Scanner scanner = new Scanner(ticktacktoe);
            int col = 0;
            int row = 0;

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] cells = line.split(";");
                for (String e1 : cells) {
                    arr[col][row] = Integer.parseInt(e1);
                    col++;
                }
                row++;
                col = 0;

            }

            //Printing ticktacktoe board from the csv file
            System.out.println(arr[0][0] + " " + arr[1][0] + " " + arr[2][0]);
            System.out.println(arr[0][1] + " " + arr[1][1] + " " + arr[2][1]);
            System.out.println(arr[0][2] + " " + arr[1][2] + " " + arr[2][2]);

        } catch (FileNotFoundException e) {
            //To diagnose (trace) an exception we use printStackTrace
            e.printStackTrace();
        }

        //if function to declare winning conditions for X
        if
                (arr[0][0] == 1 && arr[0][1] == 1 && arr[0][2] == 1 || // 1st row
                arr[1][0] == 1 && arr[1][1] == 1 && arr[1][2] == 1 || // 2nd row
                arr[2][0] == 1 && arr[2][1] == 1 && arr[2][2] == 1 || // 3rd row
                arr[0][0] == 1 && arr[1][0] == 1 && arr[2][0] == 1 || // 1st column
                arr[0][1] == 1 && arr[1][1] == 1 && arr[2][1] == 1 || // 2nd column
                arr[0][2] == 1 && arr[1][2] == 1 && arr[2][2] == 1 || // 3rd column
                arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1 || // Diagonal(1)
                arr[2][0] == 1 && arr[1][1] == 1 && arr[0][2] == 1) // Diagonal(2)
        {

            System.out.println("X wins");

        }

        //else if function to declare winning conditions for O

        else if
                (arr[0][0] == -1 && arr[0][1] == -1 && arr[0][2] == -1 || // 1st row
                arr[1][0] == -1 && arr[1][1] == -1 && arr[1][2] == -1 || // 2nd row
                arr[2][0] == -1 && arr[2][1] == -1 && arr[2][2] == -1 || // 3rd row
                arr[0][0] == -1 && arr[1][0] == -1 && arr[2][0] == -1 || // 1st column
                arr[0][1] == -1 && arr[1][1] == -1 && arr[2][1] == -1 || // 2nd column
                arr[0][2] == -1 && arr[1][2] == -1 && arr[2][2] == -1 || // 3rd column
                arr[0][0] == -1 && arr[1][1] == -1 && arr[2][2] == -1 || // Diagonal(1)
                arr[2][0] == -1 && arr[1][1] == -1 && arr[0][2] == -1) // Diagonal(2)
        {

            System.out.println("O wins");

        } else System.out.println("No winner in the game");

    }
}
