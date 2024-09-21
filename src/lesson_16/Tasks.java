package lesson_16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tasks {

    /**
     * На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
     * строка является ключом, и ее значение равно true, если эта строка встречается в массиве
     * 2 или более раз.
     */
    public static Map<String,Boolean> getWordMultipleMap(String... strings){
        Map<String,Boolean> wordMultiple = new HashMap<>();
        Arrays.stream(strings).forEach(str-> wordMultiple.put(str, wordMultiple.containsKey(str)));
        return wordMultiple;
    }

    /**
     * На вход поступает массив непустых строк, создайте и верните Map<String,
     * String> следующим образом: для каждой строки добавьте ее первый символ в
     * качестве ключа с последним символом в качестве значения.
     */
    public static Map<String,String> getPairsMap(String... strings){
        Map<String,String> wordMultiple = new HashMap<>();
        Arrays.stream(strings).forEach(str-> wordMultiple.put(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(str.length()-1))));
        return wordMultiple;
    }

    public static boolean isBalanced(String str) {
        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\[]", "")
                    .replaceAll("\\{}", "");
        }
        return (str.isEmpty());
    }
}
