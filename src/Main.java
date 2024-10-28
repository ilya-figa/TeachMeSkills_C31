import lesson_20.homework.task1.MaxInArray;
import lesson_20.homework.task1.MinInArray;
import lesson_20.homework.task2.BubbleSort;
import lesson_20.homework.task2.InsertionSort;
import lesson_20.homework.task2.SelectionSort;
import lesson_20.homework.task2.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 6, 41, 2, 31, 2, 321, 12, 3213, 2, 2, 2, 21, 1, 1, 1, 1, 3, 2, 23};
        task1(array);
        task2(array);

    }

    private static void task1(int[] array){
        Thread threadMaxArray = new MaxInArray(array);
        threadMaxArray.start();
        Thread threadMinArray = new MinInArray(array);
        threadMinArray.start();
    }

    private static void task2(int[] array){
        System.out.println(Arrays.toString(array));

        Sort bubbleSort = new BubbleSort(array);
        bubbleSort.start();
        Sort insertionSort = new InsertionSort(array);
        insertionSort.start();
        Sort selectionSort = new SelectionSort(array);
        selectionSort.start();
    }
}