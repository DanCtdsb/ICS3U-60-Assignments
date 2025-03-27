import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class SpellChecker {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = null;
        FileWriter writer = null;
        String word = null;

        try {
            reader = new BufferedReader(new FileReader("numbers.txt"));
            writer = new FileWriter("average.txt");
        } catch (FileNotFoundException exception) {
            System.out.println("Error: File not found");
        } catch (IOException exception) {
            System.out.println("Error: Cannot create/locate file");
        } finally {
            reader.close();
            writer.close();
        }
    }
}
