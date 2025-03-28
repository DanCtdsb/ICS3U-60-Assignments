import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;


public class Dictionary {
    public static void main(String[] args) throws IOException{
        Scanner keyboard = new Scanner(System.in);
        BufferedReader inputStream = null;
        HashSet<String> dictionary = new HashSet<String>();
        String word = null;

        try {
            inputStream = new BufferedReader(new FileReader("dictionary.txt"));

            // Add the dictionary into the hashset
            while ((word = inputStream.readLine()) != null) {
                dictionary.add(word.toLowerCase());
            }
            
            System.out.println("Please enter a sentence: ");
            String[] sentence = keyboard.nextLine().split(" ");

            // Check if the word is valid in the sentence
            for (int i = 0; i < sentence.length; i++) {
                String validicity = (dictionary.contains(sentence[i].toLowerCase())) ? "<valid>" : "<invalid>";
                System.out.println((i + 1) + ". " + sentence[i] + " " + validicity);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Error: File not found");
        } finally {
            inputStream.close();
            keyboard.close();
        }
    }
}
