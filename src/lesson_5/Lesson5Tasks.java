package lesson_5;

import java.util.Scanner;

/**
 * Класс с выполнением задач из пятого урока. Для каждой задачи собственный метод.
 *
 * @author Buyevich_IG
 */
public class Lesson5Tasks {

    /**
     * Task 1
     * 1.1 Создать двумерный массив, заполнить его случайными числами.
     * 1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
     * 1.3 Найти сумму всех получившихся элементов и вывести в консоль.
     */
    public static int getResulTask1(Scanner scanner) {
        int[][] matrixInt = generateRndMatrix(3,4, -10, 10);
        System.out.println("matrix = ");
        int sum = 0;
        for (int i = 0; i < matrixInt.length; i++) {
            for (int j = 0; j < matrixInt[i].length; j++) {
                matrixInt[i][j] += scanner.nextInt();
                sum += matrixInt[i][j];
            }
        }
        Lesson5Utils.printMatrix(matrixInt);
        return sum;
    }

    public static int[][] generateRndMatrix(int linesSizeArray,int columnsSizeArray, int min, int max) {
        int[][] array = new int[linesSizeArray][columnsSizeArray];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandom(min, max);
            }
        }
        return array;
    }

    private static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    /**
     * Task 2
     * Создать программу для раскраски шахматной доски с помощью цикла. Создать
     * двумерный массив String 8х8. С помощью циклов задать элементам массива значения
     * B(Black) или W(White).
     */
    public static void resulTask2() {
        String[][] chessboard = new String[8][8];
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                chessboard[i][j] = (i + j) % 2 == 0 ? "W" : "B";
            }
        }
        Lesson5Utils.printMatrix(chessboard);
    }

    /**
     * Additional task
     * Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
     */
    public static void additionalTask(int linesSize, int columnsSize) {
        int[][] matrixInt = new int[linesSize][columnsSize];
        for (int i = 0; i < matrixInt.length; i++) {
            for (int j = 0; j < matrixInt[i].length; j++) {
                if (i % 2 == 0) {
                    matrixInt[i][j] = i * matrixInt[i].length + j;
                } else {
                    matrixInt[i][j] = i * matrixInt[i].length - (j - matrixInt[i].length + 1);
                }
            }
        }
        Lesson5Utils.printMatrix(matrixInt);
    }
}
