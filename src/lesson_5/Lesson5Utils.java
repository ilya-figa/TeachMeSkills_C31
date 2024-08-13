package lesson_5;

public class Lesson5Utils {


    public static void printMatrix(int[][] array) {
        for (int[] elementArr : array) {
            for (int element : elementArr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(String[][] array) {
        for (String[] elementArr : array) {
            for (String element : elementArr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
