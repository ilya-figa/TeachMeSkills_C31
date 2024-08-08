package lesson_3;

public class Utils {
    private static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static int[] generatRndArray(int sizeArray, int min, int max) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = getRandom(min, max);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
