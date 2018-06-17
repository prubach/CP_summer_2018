package pl.waw.sgh;

//Please write a program that given a file or folder calculates:
//- the number of all files and folders (also in their subfolders)
//- the total size of all files and folders.
//
//Hint: Use recursion to implement the calculation on subfolders.

//DONE: Gets number of files and folders in a given directory
//TO DO: Total size of those files and folders - HOW???

import java.io.File;
import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Path for Directory/Folder Name");
        String Directory = sc.nextLine();
        System.out.println("Your Directory/folder is :" + Directory);

        File f = new File(Directory);

        int countFiles = 0;
        int countDirectory = 0;
        for (File file : f.listFiles()) {
            if (file.isFile()) {
                countFiles++;
            }
            if (file.isDirectory()) {
                countDirectory++;
            }

        }

        System.out.println("Number of files in Directory : " + countFiles + "\nNumber of folders " + countDirectory);
    }
}