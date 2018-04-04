package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTxt {

    //final static String FILE = "h:\\myfile.txt";
    //final static String FILE = "..\\..\\..\\myfile.txt";
    final static String FILE = "../../../myfile.txt";

    public static void main(String[] args) {
        System.out.println("File separator: " + File.separator);
        File myFile = new File(FILE);
        try {
            Scanner scanner = new Scanner(myFile);
            int i=0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                i++;
                System.out.println("Line " + i + " : " + line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
