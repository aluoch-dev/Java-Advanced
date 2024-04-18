import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myFile = new FileWriter("filename.txt");

            myFile.write("I love this so much. I could do it all day!");
            myFile.close();
        } catch(IOException e) {
            System.out.println("Am error occurred!");
        }
    }
}