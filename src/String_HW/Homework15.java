package String_HW;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println(timeLine(6));
    }

    /**
     * Question:
     * Create a method that will take an int as input.
     * return the timeline (hour am/pm) with interval of 2 hour from the current hour.
     */

    // sout(generateTimeline(5));
    // 9pm 11pm 1am 3am 5am

    // sout(generateTimeline(5));       // running the code around 8am
    // 8am 10am 12pm 2pm 4pm


    // sout(generateTimeline(10));       // running the code around 8am
    // 8am 10am 12pm 2pm 4pm 6pm 8pm 10pm 12am 2am
    public static List<String> timeLine(int length) {
        Calendar cal = Calendar.getInstance();
        List<String> listDates = new ArrayList<>();
        for (int i = 0; i < length * 2; i += 2) {
            if (listDates.size() < length) {
                cal.add(Calendar.HOUR, i);
                SimpleDateFormat df = new SimpleDateFormat("ha");
                String formattedDate = df.format(cal.getTime());
                listDates.add(formattedDate);
            }
        }
        return listDates;
    }
}

