package lesson_20.homework.task1;

import java.util.Arrays;

/**
 * @author Buyevich_I
 */
public class MinInArray extends Thread{
    private int[] array;
    public MinInArray(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println("min in array = " + Arrays.stream(array).min().getAsInt());
    }
}
