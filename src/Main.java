import lesson_1.Lesson1Tasks;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Lesson1Tasks.getResulTask1(1,2));
        System.out.println("_____________________________________");
        System.out.println(Lesson1Tasks.getResulTask2(12));
        System.out.println("_____________________________________");
        System.out.println(Lesson1Tasks.getResulTask3(123));
        System.out.println("_____________________________________");
        System.out.println(Lesson1Tasks.getUniversalTask2And3(12));
        System.out.println(Lesson1Tasks.getUniversalTask2And3(123));
        System.out.println(Lesson1Tasks.getUniversalTask2And3(1234));
        System.out.println("_____________________________________");
        System.out.println(Lesson1Tasks.getResulTask4(1.2));
        System.out.println(Lesson1Tasks.getResulTask4(1.8));
        System.out.println("_____________________________________");
        System.out.println(Lesson1Tasks.getResulTask5(21,8));
        System.out.println("_____________________________________");
        Lesson1Tasks.additionalTask_v1(1,2);
        System.out.println("_____________________________________");
        Lesson1Tasks.additionalTask_v2(1,2);
    }
}