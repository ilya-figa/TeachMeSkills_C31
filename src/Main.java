import lesson14.FileUtils;

public class Main {
    public static void main(String[] args) {
        maxWordInFile("allText.txt");
        writeTextAntPrintFirstChar("text.txt");
    }

    private static void maxWordInFile(String path){
        StringBuilder stringBuilder = FileUtils.readFile(path);
        if (stringBuilder != null) {
            String[] words = stringBuilder.toString().split("\\s");
            String maxWord = "";
            for (String word: words){
                if(maxWord.length() < word.length()){
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
}