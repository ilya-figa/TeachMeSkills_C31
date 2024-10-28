package lesson_20.homework.task2;

/**
 * @author Buyevich_I
 */
public class InsertionSort extends Sort{

    public InsertionSort(int[] array) {
        super(array);
    }

    @Override
    protected void sorting(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            int swap = array[i];
            for (j = i; j > 0 && swap < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = swap;
        }
    }
}
