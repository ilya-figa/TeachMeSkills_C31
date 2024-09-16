package lesson13;

import java.util.regex.Pattern;

public class Utils {
    public static boolean isLengthCheck(String str, int maxLength){
        return str != null && str.length() > 1 && str.length() < maxLength;
    }

    public static boolean isContainsSpace(String src){
        return Pattern.compile("\\s").matcher(src).find();
    }

    public  static boolean isContainsNum(String src){
        return Pattern.compile("\\d").matcher(src).find();
    }
}
