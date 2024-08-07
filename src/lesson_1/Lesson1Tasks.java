package lesson_1;

/**
 * Класс с выполнением задач из первого урока. Для каждой задачи собственный метод.
 *
 * @author Buyevich_IG
 */
public class Lesson1Tasks {
    /**
     * Task 1
     * Написать приложение, которое будет вычислять и выводить значение по формуле:
     * a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
     */
    public static double getResulTask1(double first, double second) {
        return 4 * (first + second - 1) / 2;
    }

    /**
     * Task 2
     * В переменной n хранится двузначное число. Создайте программу, вычисляющую и
     * выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
     * (2+6).
     */
    public static int getResulTask2(int twoDigitNumber) {
        return (twoDigitNumber % 10) + (twoDigitNumber / 10);
    }

    /**
     * Task 3
     * В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
     * выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
     * 9 (1+2+6).
     */
    public static int getResulTask3(int threeDigitNumber) {
        return (threeDigitNumber % 10) + (threeDigitNumber % 100 / 10) + (threeDigitNumber / 100);
    }

    /**
     * Task 2-3
     * Универсальный способ сложения всех цифр числа
     */
    public static int getUniversalTask2And3(int number) {
        int sum = 0;
        while (number > 0){
            sum += number%10;
            number = number/10;
        }
        return sum;
    }

    /**
     * Task 4
     * В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
     * программу, округляющую число n до ближайшего целого и выводящую результат на
     * экран.
     */
    public static double getResulTask4(double numberDouble) {
        return Math.round(numberDouble);
    }

    /**
     * Task 5
     * В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
     * на экран результат деления q на w с остатком. Пример вывода программы (для случая,
     * когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
     */
    public static double getResulTask5(int dividend, int divider) {
        return (double) dividend/divider;
    }

    /**
     * Additional task
     * Написать программу которая будет менять местами значение целочисленных
     * переменных. Пример:
     * int a = 1; int b = 2;
     * //код (ваше решение)
     * sout(a); //выведет 2
     * sout(b); //выведет 1
     */
    public static void additionalTask_v1(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }

    /**
     * Additional task
     * Дополнительное решение задачи со звёздочкой
     */
    public static void additionalTask_v2(int a, int b) {
        a += b;
        b = a-b;
        a -= b;
        System.out.println(a);
        System.out.println(b);
    }
}
