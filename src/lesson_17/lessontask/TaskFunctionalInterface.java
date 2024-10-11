package lesson_17.lessontask;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Buyevich_I
 */
public class TaskFunctionalInterface {
    private static final double USD_RATE = 3.2;

    /**
     * Задача 2:
     * Используя Predicate среди массива чисел вывести только те, которые являются
     * положительными.
     */
    public static void printOnlyPositive(int[] intArray){
        Predicate<Integer> isEven = x -> x > 0;
        for(Integer integer : intArray){
            if(isEven.test(integer)){
                System.out.println(integer);
            }
        }
    }

    /**
     * Задача 3:
     * Используя Function реализовать лямбду, которая будет принимать в себя строку в
     * формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
     * возвращать сумму, переведенную сразу в доллары.
     * @return Function<String, String>
     */
    public static Function<String, String> getFunctionBYNtoUSD(){
        return x -> {
            String[] temp = x.split(" ");
            return (Double.parseDouble(temp[0]) / USD_RATE) + " " + "USD";
        };
    }

    /**
     * Задача 4:
     * Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
     * формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
     * выводить сумму, переведенную сразу в доллары.
     * @return Consumer<String>
     */
    public static Consumer<String> getConsumerBYNtoUSD(){
        return x ->{
            String[] temp = x.split(" ");
            System.out.println((Double.parseDouble(temp[0]) / USD_RATE) + " " + "USD");
        };
    }

    /**
     * Задача 5:
     * Используя Supplier написать метод, который будет возвращать введенную с консоли
     * строку задом наперед.
     * @return Supplier<String>
     */
    public static Supplier<String> getSupplierReverseStr(){
        return  () -> {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = input.length()-1; i > -1; i--){
                stringBuilder.append(input.charAt(i));
            }
            return stringBuilder.toString();
        };
    }

}
