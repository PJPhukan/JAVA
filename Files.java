
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {

        // create a new file

        // File myFile = new File("sample.txt");
        // try {
        // myFile.createNewFile();
        // } catch (Exception e) {
        // System.out.println("error occured while creating file");
        // e.printStackTrace();
        // }

        // write to a file

        // try {
        // FileWriter writer = new FileWriter("sample.txt");
        // writer.write("Write to sample.txt file through FileWriter.");
        // writer.close();
        // } catch (Exception e) {
        // System.out.println("Error occured while writing to a file");
        // e.printStackTrace();
        // }

        // Read text from a file 
        // try {
        // File myFile = new File("sample.txt");
        // Scanner sc = new Scanner(myFile);
        // while (sc.hasNextLine()) {
        // String line = sc.nextLine();
        // System.out.println(line);
        // }
        // sc.close();
        // } catch (Exception e) {

        // System.out.println("Error occured while reading file");
        // e.printStackTrace();
        // }

        // Delete a file

        try {
            File myFile = new File("sample.txt");
            if (myFile.delete()) {
                System.out.println("File deleted successfully :" + myFile.getName());
            } else {
                System.out.println("File is not deleted ");
            }
        } catch (Exception e) {
            System.out.println("Error occured while deleting file ");
            e.printStackTrace();
        }
    }
}
