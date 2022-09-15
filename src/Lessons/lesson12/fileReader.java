package Lessons.lesson12;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class fileReader {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("file1.txt");
        Scanner scanner = new Scanner(fileReader);
        int line = 1;
        while (scanner.hasNextLine()) {
            System.out.println("Line " + line + " : " + scanner.nextLine());
            line++;
        }
        fileReader.close();
    }


}
