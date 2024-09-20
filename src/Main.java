import lesson14.FileUtils;
import lesson14.Student;

public class Main {
    public static void main(String[] args) {
        maxWordInFile("allText.txt");
        writeTextAntPrintFirstChar("text.txt");
        serializableStudent("student.txt");
    }

    private static void maxWordInFile(String path) {
        StringBuilder stringBuilder = FileUtils.readFile(path);
        if (stringBuilder != null) {
            String[] words = stringBuilder.toString().split("\\s");
            String maxWord = "";
            for (String word : words) {
                if (maxWord.length() < word.length()) {
                    maxWord = word;
                }
            }
            FileUtils.writeFile("maxWord.txt", maxWord);
        }
    }

    private static void writeTextAntPrintFirstChar(String path) {
        FileUtils.writeFile(path, "Cognosce te ipsum");

        StringBuilder stringBuilder = FileUtils.readFile(path);
        if (stringBuilder != null) {
            System.out.println(stringBuilder.charAt(0));
        }
    }

    private static void serializableStudent(String path) {
        FileUtils.writeObject(path, new Student("1", "2", 3, 4));
        Object object = FileUtils.readObject(path);
        if(object != null){
            System.out.println(object);
        }

    }
}