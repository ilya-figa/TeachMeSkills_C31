import lesson11.Lesson11Tasks;
import lesson11.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = Utils.getStrings(scanner);

        runTask1(strings);
        runTask2(strings);
        runTask3(strings);
        runTask4(strings);
        runTask5("Hello");
        runTask6("HelloHello Hellollo Hello23 Hello1 heeh goh asdxcs asdascre dffd axa sad");


    }

    /**
     * Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
     * найденные строки и их длину.
     */
    private static void runTask1(String[] strings){
        Utils.printTask(1);
        String minStr = Lesson11Tasks.getMinStr(strings);
        String maxStr = Lesson11Tasks.getMaxStr(strings);
        System.out.println("Min str =" + minStr + "; length =" + minStr.length());
        System.out.println("Max str =" + maxStr + "; length =" + maxStr.length());
    }

    /**
     * Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
     * значений их длины.
     */
    private static void runTask2(String[] strings){
        Utils.printTask(2);
        Lesson11Tasks.sortArrStr(strings);
        System.out.println("Sorting array");
        Utils.printArrStr(strings);
    }
    /**
     * Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
     * средней, а также их длину.
     */
    private static void runTask3(String[] strings){
        Utils.printTask(3);
        Lesson11Tasks.belowAverage(strings);
    }
    /**
     * Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
     * Если таких слов несколько, найти первое из них.
     */
    private static void runTask4(String[] strings){
        Utils.printTask(4);
        Lesson11Tasks.outputWordsWithoutRepetitions(strings);
    }

    /**
     * Вывести на консоль новую строку, которой задублирована каждая буква из
     * начальной строки. Например, "Hello" -> "HHeelllloo".
     */
    private static void runTask5(String str){
        Utils.printTask(5);
        System.out.println("result = " + Lesson11Tasks.multiplyEachLetter(str,2));
    }
    /**
     * Дана строка произвольной длины с произвольными словами. Написать программу для
     * проверки является ли любое выбранное слово в строке палиндромом.
     */
    private static void runTask6(String words){
        Utils.printTask(6);
        Lesson11Tasks.outputPalindromicWords(words);
    }


}