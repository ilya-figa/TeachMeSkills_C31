package lesson_17.lessonpractice;

import java.time.LocalDate;

/**
 * @author Buyevich_I
 */
public class Event {
    private String nameEvent;
    private LocalDate dateEvent;

    public Event(String nameEvent, LocalDate dateEvent){
        this.setNameEvent(nameEvent);
        this.setDateEvent(dateEvent);
    }

    @Override
    public String toString() {
        return "Event{" +
                "nameEvent='" + nameEvent + '\'' +
                ", dateEvent=" + dateEvent +
                '}';
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public LocalDate getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(LocalDate dateEvent) {
        this.dateEvent = dateEvent;
    }
}
