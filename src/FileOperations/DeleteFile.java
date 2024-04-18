package FileOperations;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("filename.txt");

        if(myFile.delete()) {
            System.out.println("File " + myFile + " deleted!");
        } else {
            System.out.println("Delete action failed!");
        }
    }

}
