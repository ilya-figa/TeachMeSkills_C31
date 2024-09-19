package lesson15.task1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Buyevich_I
 */
public class Task1 {
    private Set<Integer> integerSet;

    public void setIntegerSet(String str) {
        String[] numbers = str.split(", ");
        integerSet = new HashSet<>();
        for (String number:numbers) {
            integerSet.add(Integer.valueOf(number));
        }
    }

    public void printIntegerSet(){
        System.out.println(integerSet.stream().toList());
    }
}
