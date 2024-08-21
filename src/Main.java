import lesson_3.Lesson3Tasks;
import lesson_3.Lesson3Utils;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] arrayInt = Lesson3Utils.generatRndArray(sizeArray, Lesson3Utils.MIN, Lesson3Utils.MAX);

        System.out.print("array = ");
        Lesson3Utils.printArray(arrayInt);

        System.out.println("----------------------------TASK 1----------------------------");
        Lesson3Tasks.resulTask1(arrayInt);
        System.out.println("----------------------------TASK 2----------------------------");
        Lesson3Tasks.resulTask2(arrayInt);
        System.out.println("----------------------------TASK 3----------------------------");
        Lesson3Tasks.resulTask3(arrayInt);
        System.out.println("----------------------------TASK 4----------------------------");
        Lesson3Tasks.resulTask4(arrayInt);
        System.out.println("----------------------------TASK 5----------------------------");
        Lesson3Tasks.resulTask5(arrayInt.clone());
        System.out.println("----------------------------TASK 6----------------------------");
        Lesson3Tasks.resulTask6(arrayInt);
        System.out.println("----------------------------Additional task----------------------------");
        //Первый способ через рекурсию
        Lesson3Tasks.additionalTask_v1(new int[]{1,2,3});
        Lesson3Tasks.additionalTask_v1(new int[]{1,2,9});
        Lesson3Tasks.additionalTask_v1(new int[]{1,9,9});
        Lesson3Tasks.additionalTask_v1(new int[]{9,9,9});
        //Второй способ через строки
        Lesson3Tasks.additionalTask_v2(new int[]{1,2,3});
        Lesson3Tasks.additionalTask_v2(new int[]{1,2,9});
        Lesson3Tasks.additionalTask_v2(new int[]{1,9,9});
        Lesson3Tasks.additionalTask_v2(new int[]{9,9,9});
    }
}