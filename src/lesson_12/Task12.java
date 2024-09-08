package lesson_12;

import java.util.regex.Pattern;

public class Task12 {
    public static void printAbbreviation(String text){
        String[] words = text.split(" ");
        for(String word: words){
            if(Pattern.matches("[A-Z]+", word)){
                System.out.println(word);
            }
        }
    }
}
