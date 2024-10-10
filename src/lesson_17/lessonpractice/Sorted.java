package lesson_17.lessonpractice;

import java.util.List;

/**
 * @author Buyevich_I
 */
@FunctionalInterface
public interface Sorted<T> {
    void sort(List<T> list);
}
