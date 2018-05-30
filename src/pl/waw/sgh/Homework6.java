//
//1. Please download a CSV file containing the stock history of 3 companies, for example:
//http://finance.yahoo.com/q/hp?s=GOOG
//http://finance.yahoo.com/q/hp?s=IBM
//http://finance.yahoo.com/q/hp?s=MSFT
//
//(Download Data)
//Save files giving them different names to a location on your drive
//
//2. Write a program that searches for CSV files with stock rates in a given folder and for every one of them:
//
//3. Calculates the percentage change betweeen Close and Open price and adds these values as another column to this CSV file.
//You can replace the old file or create a new one.
//
//Change = (Close-Open)/Open
//
//Note: You can use the following code snippet to retrieve all files in a given directory:
//
//File folder = new File("path_to_folder");
// File[] listOfFiles = folder.listFiles();
//
// for (int i = 0; i < listOfFiles.length; i++) {
//   if (listOfFiles[i].isFile()) {
//     System.out.println("File " + listOfFiles[i].getName());
//   } else if (listOfFiles[i].isDirectory()) {
//     System.out.println("Directory " + listOfFiles[i].getName());
//   }
// }

package pl.waw.sgh;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Maciej Mucha\\Documents\\Homework5");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println("File updated: " + file.getName());
                try {
                    copyAndImproveFile(file);
                }catch (FileNotFoundException e){
                    System.out.println("File: "+file.getName()+ " not found in "+folder);
                }
            }
        }
    }
    public static void copyAndImproveFile (File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);

        File outfile = new File("C:\\Users\\Maciej Mucha\\Documents\\Homework5\\"+"_"+file.getName());

        try {
            FileWriter fw = new FileWriter(outfile);
            BufferedWriter out = new BufferedWriter(fw);

            out.write(scanner.nextLine()+",Percentage Change");
            out.newLine();
            while (scanner.hasNext()) {

                String line = scanner.nextLine();
                out.write(addPercentageChangeField(line));
                out.newLine();
            }

            out.close();
            fw.close();
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }

    public static String addPercentageChangeField (String line){
        String[] lineSplitted = line.split(",");
        Double openD = Double.parseDouble(lineSplitted[1]);
        Double closeD = Double.parseDouble(lineSplitted[4]);

        Double changeD = ((closeD - openD) / openD) * 100;
        return line+","+String.format(Locale.US, "%.4f", changeD);
    }
}
