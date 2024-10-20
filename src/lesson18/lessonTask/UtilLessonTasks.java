package lesson18.lessonTask;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Buyevich_I
 */
public class UtilLessonTasks {
    /**
     * Задача 1:
     * Создать класс User с полем name. В Main создать поле user типа User. Заранее мы не
     * знаем лежит там объект или отсутствует. Написать логику, которая будет выводить имя
     * пользователя если объект присутствует в user, либо ‘DEFAULT’ в противном случае.
     * Использовать класс Optional.
     * @param user user
     */
    public static void checkUser(User user){
        System.out.println(Optional.ofNullable(user).isPresent() ? user.getName() : "DEFAULT");
    }

    /**
     * Задача 2:
     * При помощи стримов из списка строк вывести только те, которые начинаются с буквы ‘A’.
     * @param stringList List<String> stringList
     * @return List<String> with the first letter A
     */
    public static List<String> getListFirstA(List<String> stringList){
        return stringList.stream().filter(str-> str.startsWith("A")).collect(Collectors.toList());
    }

    /**
     * Задача 3:
     * При помощи стримов из списка, содержащего объекты Developer, вывести только те, id >
     * 10 и name начинается с ‘An’.
     * @param developerList List<Developer> developerList
     * @return List<Developer> with id > 10 and name starts with 'An'
     */
    public static List<Developer> getDeveloperList(List<Developer> developerList){
        return developerList.stream().filter(developer-> developer.getId() > 10 && developer.getName().startsWith("An")).collect(Collectors.toList());
    }
}
