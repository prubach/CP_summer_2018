package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadCsv {

    //final static String FILE = "h:\\myfile.txt";
    //final static String FILE = "..\\..\\..\\myfile.txt";
    final static String FILE = "../../../Book1.csv";

    public static void main(String[] args) {
        //System.out.println("File separator: " + File.separator);
        File myFile = new File(FILE);
        try {
            Scanner scanner = new Scanner(myFile);
            int i=0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] cells = line.split(",");
                for (String el : cells) {
                    System.out.println("El: " + el);
                }
                System.out.println("New line");
                i++;
                //System.out.println("Line " + i + " : " + line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
