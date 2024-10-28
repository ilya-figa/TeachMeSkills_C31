package lesson_20.homework.task2;

/**
 * @author Buyevich_I
 */
public class SelectionSort extends Sort{

    public SelectionSort(int[] array) {
        super(array);
    }

    @Override
    protected void sorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }
}
