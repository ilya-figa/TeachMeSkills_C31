package lesson_20.homework.task2;

import java.util.Arrays;

/**
 * @author Buyevich_I
 */
public abstract class Sort extends Thread{
    private int[] array;
    public Sort(int[] array){
        this.array = array;
    }

    protected abstract void sorting(int[] array);

    @Override
    public void run() {
        sorting(array);
        System.out.println(Arrays.toString(array));
    }
}
