package lesson18.homework;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Задача 1:
 * Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
 * Stream'ов:
 * - Удалить дубликаты
 * - Оставить только четные элементы
 * - Вывести сумму оставшихся элементов в стриме
 * @author Buyevich_I
 */
public class HomeworkTask1 {
    /**
     * Решение задачи в 1 строку
     */
    public static Integer getSumEvenElementsNotDuplicates(List<Integer> integerList){
        return integerList.stream().distinct().filter(integer -> integer % 2 == 0).mapToInt(integer-> integer).sum();
    }

    /**
     * Удалить дубликаты
     */
    public static List<Integer> removeDuplicates(List<Integer> integerList){
        return integerList.stream().distinct().collect(Collectors.toList());
    }

    /**
     * Оставить только четные элементы
     */
    public static List<Integer> removeOdd(List<Integer> integerList){
        return integerList.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
    }

    /**
     * Вывести сумму оставшихся элементов в стриме
     */
    public static Integer getSum(List<Integer> integerList){
        return integerList.stream().mapToInt(integer-> integer).sum();
    }
}
