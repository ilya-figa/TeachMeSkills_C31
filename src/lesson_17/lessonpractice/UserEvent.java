package lesson_17.lessonpractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Buyevich_I
 */
public class UserEvent {
    private List<Event> eventsList;

    public UserEvent(){
        eventsList = new ArrayList<>();
    }

    public void addNewEvent(String nameEvent, LocalDate dateEvent){
        eventsList.add(new Event(nameEvent,dateEvent));
    }

    public void addNewEvent(String nameEvent, String dateEventStr){
        eventsList.add(new Event(nameEvent, LocalDate.parse(dateEventStr, LocalDateUtils.yyyy_MM_dd)));
    }

    public void printSortedList(){
        List<Event> sortedList = eventsList.stream()
                .sorted(Comparator.comparing(Event::getDateEvent)).toList();
        for (Event event:sortedList) {
            System.out.println(event.toString());
        }
    }

    @Override
    public String toString() {
        return eventsList.toString();
    }

}
