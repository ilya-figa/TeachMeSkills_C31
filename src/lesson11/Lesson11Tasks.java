package lesson11;

public class Lesson11Tasks {
    public static String getMinStr(String[] strings) {
        String temp = strings[0];
        for (String str : strings) {
            if (temp.length() > str.length()) {
                temp = str;
            }
        }
        return temp;
    }

    public static String getMaxStr(String[] strings) {
        String temp = strings[0];
        for (String str : strings) {
            if (temp.length() < str.length()) {
                temp = str;
            }
        }
        return temp;
    }

    public static void sortArrStr(String[] strings) {
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i].length() > strings[i + 1].length()) {
                String temp = strings[i];
                strings[i] = strings[i + 1];
                strings[i + 1] = temp;
            }
        }
    }

    public static void belowAverage(String[] strings) {
        int l0 = strings[0].length();
        int l1 = strings[1].length();
        int l2 = strings[2].length();

        int averageInt;

        if (((l0 > l1) && (l0 < l2)) || ((l0 < l1) && (l0 > l2))) {
            averageInt = l0;
        } else if (((l1 > l0) && (l1 < l2)) || ((l1 < l0) && (l1 > l2))) {
            averageInt = l1;
        } else {
            averageInt = l2;
        }

        for(String str:strings){
            if(str.length() < averageInt){
                System.out.println("String = " + str + "; length =" + str.length());
            }
        }
    }

    public static void outputWordsWithoutRepetitions(String[] strings) {
        for(String mainStr:strings){
            String[] words = mainStr.split(" ");
            for(String word: words){
                StringBuilder stringBuilder = new StringBuilder();
                boolean isRepetition = false;
                for (int i = 0; i < word.length(); i++) {
                    if(isRepetition(stringBuilder, word.charAt(i))){
                        isRepetition = true;
                        break;
                    }else{
                        stringBuilder.append(word.charAt(i));
                    }
                }

                if(!isRepetition){
                    System.out.println("Word without repetitions :" + word);
                }
            }
        }
    }

    private static boolean isRepetition(StringBuilder stringBuilder, Character character){
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(character.equals(stringBuilder.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static String multiplyEachLetter(String str, int factor){
        StringBuilder stringBuilder = new StringBuilder();

        String[] strArr = str.split("");
        for (String character : strArr) {
            stringBuilder.append(character.repeat(factor));
        }

        return stringBuilder.toString();
    }

    public static void outputPalindromicWords(String words) {
        String[] wordsArr = words.split(" ");
        for(String word:wordsArr){
            if(isPalindromic(word)){
                System.out.println("Palindromic word : " + word);
            }
        }
    }

    private static boolean isPalindromic(String word){
        int middle = word.length() / 2;
        for (int i = 0, j = word.length() - 1; i < middle; i++, j--) {
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
