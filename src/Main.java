import lesson_5.Lesson5Tasks;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------TASK 1----------------------------");
        Lesson5Tasks.resulTask1(scanner);
        System.out.println("----------------------------TASK 2----------------------------");
        Lesson5Tasks.resulTask2();
        System.out.println("----------------------------Additional task----------------------------");
        Lesson5Tasks.additionalTask(4,6);
    }
}