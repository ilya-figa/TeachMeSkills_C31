import lesson_17.lessonpractice.IAOrB;
import lesson_17.lessonpractice.IShape;
import lesson_17.lessonpractice.LocalDateUtils;
import lesson_17.lessonpractice.UserEvent;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateUtils.getDayOfTheWeek(LocalDate.now()));
        System.out.println(LocalDateUtils.getDateNextTuesday());

        IShape square = (a, b) -> Double.valueOf((a * b));
        IShape triangle = (a, h) -> (0.5 * a * h);

        IAOrB aOrB = (a, b) -> {
            if (a < b) {
                return a;
            }else if(a > b){
                return b;
            }else{
                return 0;
            }
        };

        System.out.println(LocalDateUtils.getNewDateFormat("2024-10-10 20:53"));

        UserEvent userEvent = new UserEvent();
        userEvent.addNewEvent("1", LocalDate.now());
        userEvent.addNewEvent("2", "2024-10-11");
        userEvent.addNewEvent("3", "2024-10-10");
        userEvent.addNewEvent("4", "2024-10-09");
        userEvent.printSortedList();

        LocalDateUtils.printCountDaysOff("2024-10-01", "2024-10-12");

        /*List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);*/
        //sorted

    }
}