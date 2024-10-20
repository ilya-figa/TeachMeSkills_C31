import lesson18.homework.AdditionalTask;
import lesson18.homework.HomeworkTask1;
import lesson18.lessonTask.Developer;
import lesson18.lessonTask.User;
import lesson18.lessonTask.UtilLessonTasks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Lesson task 1
        UtilLessonTasks.checkUser(null);
        UtilLessonTasks.checkUser(new User("name"));
        //Lesson task 2
        System.out.println(UtilLessonTasks.getListFirstA(new ArrayList<>(Arrays.asList("qwe", "asd", "1w", "Ads1", "asd", "A", "ASD"))));
        //Lesson task 3
        System.out.println(UtilLessonTasks.getDeveloperList(new ArrayList<>(Arrays.asList(
                new Developer(1, "name1"),
                new Developer(12, "Aname2"),
                new Developer(13, "name2"),
                new Developer(1, "Aname2"),
                new Developer(10, "Aname2")))));

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8));
        System.out.println(HomeworkTask1.getSumEvenElementsNotDuplicates(integerList));
        /*integerList = HomeworkTask1.removeDuplicates(integerList);
        integerList = HomeworkTask1.removeOdd(integerList);
        System.out.println(HomeworkTask1.getSum(integerList));*/

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "name");
        map.put(2, "name1");
        map.put(3, "name2name2");
        map.put(4, "Name");
        map.put(5, "Name1");

        System.out.println(map);
        System.out.println(AdditionalTask.getMapIdName(map));

        /*map = AdditionalTask.getContainsKeyMap(map);
        System.out.println(map);
        map = AdditionalTask.getOddNumberName(map);
        System.out.println(map);
        System.out.println(AdditionalTask.getNameBackwards(map));*/

    }


}