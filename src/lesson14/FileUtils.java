package lesson14;

import java.io.*;
import java.util.Scanner;

public class FileUtils {

    public static StringBuilder readFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(path);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }

        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
            return null;
        }

        return stringBuilder;
    }

    public static void writeFile(String path, String stringBuilder) {
        try (FileWriter writer = new FileWriter(path, false)) {
            writer.write(stringBuilder);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
