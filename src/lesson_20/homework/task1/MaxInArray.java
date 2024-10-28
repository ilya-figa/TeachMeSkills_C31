package lesson_20.homework.task1;

import java.util.Arrays;

/**
 * @author Buyevich_I
 */
public class MaxInArray extends Thread{
    private int[] array;

    public MaxInArray(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println("max in array = " + Arrays.stream(array).max().getAsInt());
    }
}
