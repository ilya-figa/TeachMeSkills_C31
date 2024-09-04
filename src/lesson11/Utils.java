package lesson11;

import java.util.Scanner;

public class Utils {
    public static String[] getStrings(Scanner scanner){
        return new String[]{
                scanner.next(),
                scanner.next(),
                scanner.next()
        };
    }

    public static String[] getStrings(){
        return new String[]{
                "String 1",
                "Str 2",
                "My first test string"
        };
    }

    public static void printTask(int numTask){
        System.out.println("-----------------------------Task" + numTask + "-----------------------------");
    }

    public static void printArrStr(String[] strings){
        for(String str : strings){
            System.out.println(str);
        }
    }

}
