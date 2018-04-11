package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void main(String[] args) {
        File file = new File("h:/fw.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("My first line");
            bw.newLine();
            bw.write("Second line");

            bw.close();
            fw.close();

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}
