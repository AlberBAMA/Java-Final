import java.util.Scanner;
import java.io.*;

public class FileLetterCounterFinal {
    public static void main(String[] args) throws IOException {

        String fName;
        String fcharInput;
        char tChar;
        int count = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type the .txt file name!");
        fName = keyboard.nextLine();

        System.out.print("Type the char that will be count!");
        fcharInput = keyboard.nextLine();
        tChar = fcharInput.charAt(0);

        // Here I am opening the file
        File file = new File(fName);

        // Verifying if the file exist
        if (!file.exists()) {
            System.out.println("The file does not exist.");
            return;
        }

        Scanner inputFile = new Scanner(file);

        // Loop to read the file.
        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();

            // For loop to check each letter.
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == tChar) {
                    count++;
                }}
        }

        inputFile.close();

        System.out.println("The char '" + tChar + "' is " +
                count + " times.");
    }
}
