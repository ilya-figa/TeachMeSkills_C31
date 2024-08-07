import lesson_2.Lesson2Tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Lesson2Tasks.getResulTask1(number));
        System.out.println("________________________________________________");

        number = scanner.nextInt();
        System.out.println(Lesson2Tasks.getResulTask2(number));
        System.out.println("________________________________________________");

        Lesson2Tasks.resulTask3();
        System.out.println("________________________________________________");

        Lesson2Tasks.resulTask4(14);
        System.out.println("________________________________________________");

        number = scanner.nextInt();
        System.out.println(Lesson2Tasks.additionalTask(number));
        System.out.println("________________________________________________");
    }
}