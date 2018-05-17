package pl.waw.sgh;

// Please write a program that given a file or folder calculates:
// - the number of all files and folders (also in their subfolders)
// - the total size of all files and folders.
// Hint: Use recursion to implement the calculation on subfolders.

// https://www.tutorialspoint.com/java/io/file_list.htm

// 09.05: program calculates number of files in the directory

import java.io.File;

public class Homework4 {
    public static void main(String args[]){
        File directory=new File("C:\\Windows");
        // The methodreturns the array of files and directories
        // in the directory defined by this abstract path name
        // so if we add .lenght, we will get a lenght of this list = number of files and folders
        // including the hidden ones (?)
        int fileCount=directory.list().length;
        System.out.println("The number of files in the directory:"+fileCount);
    }
}