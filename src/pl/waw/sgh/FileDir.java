package pl.waw.sgh;

import java.io.File;

public class FileDir {

    public static void main(String[] args) {
        String tmpDir = System.getProperty("java.io.tmpdir");
        File myDir = new File(tmpDir);

        boolean isDir = myDir.isDirectory();
        System.out.println(isDir);

        if (isDir) {
            File[] subFiles = myDir.listFiles();
            for (File f : subFiles) {

                System.out.println(f.getName() + " " + f.length());
            }

        }



    }
}
