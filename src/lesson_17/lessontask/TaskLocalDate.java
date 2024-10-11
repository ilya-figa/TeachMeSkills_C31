package lesson_17.lessontask;

import lesson_17.lessonpractice.LocalDateUtils;

import java.time.LocalDate;

/**
 * @author Buyevich_I
 */
public class TaskLocalDate {
    /**
     * Задача 1:
     * Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
     * когда пользователю исполнится 100 лет. Использовать Date/Time API.
     * @return +100Years
     */
    public static String get100Years(String birthday) {
        return LocalDate.parse(birthday, LocalDateUtils.yyyy_MM_dd).plusYears(100).toString();
    }
}
