package lesson18.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Задача *:
 * Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
 * этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
 * Среди отобранных значений отобрать только те, которые имеют нечетное количество
 * букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
 *
 * @author Buyevich_I
 */
public class AdditionalTask {
    private static final List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 5, 8, 9, 13));

    /**
     * id которых попадает в числовой диапазон 1/2/5/8/9/13
     */
    public static Map<Integer, String> getContainsKeyMap(Map<Integer, String> integerStringMap) {
        return integerStringMap.keySet().stream().filter(integerList::contains).collect(Collectors.toMap(k -> k, integerStringMap::get));
    }

    /**
     * нечетное количество букв в имени
     */
    public static Map<Integer, String> getOddNumberName(Map<Integer, String> integerStringMap) {
        return integerStringMap.keySet().stream().filter(id -> integerStringMap.get(id).length() % 2 == 1).collect(Collectors.toMap(k -> k, integerStringMap::get));
    }

    /**
     * вернуть список List имен, записанных буквами задом наперед
     */
    public static List<String> getNameBackwards(Map<Integer, String> integerStringMap) {
        return integerStringMap.values().stream().map(name -> new StringBuilder(name).reverse().toString()).collect(Collectors.toList());
    }

    /**
     * Решение задачи в 1 строку
     */
    public static List<String> getMapIdName(Map<Integer, String> integerStringMap) {
        return integerStringMap.keySet().stream().filter(integerList::contains)
                .filter(id -> integerStringMap.get(id).length() % 2 == 1)
                .collect(Collectors.toMap(k -> k, integerStringMap::get))
                .values().stream().map(name -> new StringBuilder(name).reverse().toString()).collect(Collectors.toList());
    }
}
