package lesson_20.homework.task2;

/**
 * @author Buyevich_I
 */
public class BubbleSort extends Sort{

    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    protected void sorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }
}
