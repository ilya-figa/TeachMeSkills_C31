package lesson_2;

/**
 * Класс с выполнением задач из второго урока. Для каждой задачи собственный метод.
 *
 * @author Buyevich_IG
 */
public class Lesson2Tasks {
    /**
     * Task 1
     * Напишите программу, которая будет принимать на вход число из консоли и на выход
     * будет выводить сообщение четное число или нет. Для определения четности числа
     * используйте операцию получения остатка от деления (операция выглядит так: '% 2')
     */
    public static String getResulTask1(int number) {
        return number % 2 == 0 ? "Четное" : "Нечетное";
    }

    /**
     * Task 2
     * Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
     * Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
     */
    public static String getResulTask2(int temperature) {
        if (temperature > -5) {
            return "Warm";
        } else if (temperature > -20) {
            return "Normal";
        } else {
            return "Cold";
        }
    }

    /**
     * Task 3
     * Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
     */
    public static void resulTask3() {
        for (int i = 10; i < 21; i++) {
            System.out.println((int)Math.pow(i, 2));
        }
    }

    /**
     * Task 4
     * Необходимо, чтоб программа выводила на экран вот такую последовательность:
     * 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
     */
    public static void resulTask4(int numberOutputs) {
        int i = 1;
        while (i <= numberOutputs) {
            System.out.print(7*i++ + " ");
        }
        System.out.println();
    }

    /**
     * Additional task
     * Напишите программу, где пользователь вводит любое целое положительное число. А
     * программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
     * числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
     * ввести некорректные данные
     */
    public static int additionalTask(int maxNumber) {
        if(maxNumber < 1){
            System.out.println("некорректные данные");
            return -1;
        }
        int sum = 0;
        for (int i = 1; i < maxNumber; i++){
            sum += i;
        }
        return sum;
    }
}
