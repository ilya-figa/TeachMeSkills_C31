package lesson_17.lessonpractice;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author Buyevich_I
 */
public class LocalDateUtils {

    public static final DateTimeFormatter yyyy_MM_dd_HH_mm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    public static final DateTimeFormatter yyyy_MM_dd = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static String getDayOfTheWeek(LocalDate localDate) {
        return localDate.format(DateTimeFormatter.ofPattern("EEEE"));
    }

    public static LocalDate getDateNextTuesday() {
        LocalDate localDate = LocalDate.now();
        while (true) {
            if (DayOfWeek.TUESDAY.equals(localDate.getDayOfWeek())) {
                return localDate;
            } else {
                localDate = localDate.plusDays(1);
            }
        }
    }

    public static LocalDateTime getNewDateFormat(String strDate) {
        ZonedDateTime zdt = LocalDateTime.parse(strDate, yyyy_MM_dd_HH_mm).atZone(ZoneId.of("Europe/Monaco"));
        return zdt.withZoneSameInstant(ZoneId.of("Africa/Cairo")).toLocalDateTime();
    }

    public static void printCountDaysOff(String firstDate, String secondDate) {
        LocalDate firstLocalDate = LocalDate.parse(firstDate, yyyy_MM_dd);
        LocalDate secondLocalDate = LocalDate.parse(secondDate, yyyy_MM_dd);
        secondLocalDate = secondLocalDate.plusDays(1);
        int countSATURDAY = 0;
        int countSUNDAY = 0;
        while (!firstLocalDate.equals(secondLocalDate)) {
            switch (firstLocalDate.getDayOfWeek()) {
                case SATURDAY -> {
                    countSATURDAY++;
                    firstLocalDate = firstLocalDate.plusDays(1);
                }
                case SUNDAY -> {
                    countSUNDAY++;
                    firstLocalDate = firstLocalDate.plusDays(1);
                }
                default -> firstLocalDate = firstLocalDate.plusDays(1);
            }
        }
        System.out.println("countSATURDAY = " + countSATURDAY);
        System.out.println("countSUNDAY = " + countSUNDAY);
    }
}
