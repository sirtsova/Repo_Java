package Classwork;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesClass {
    public static void main(String[] args) {
        Date currentDate = new Date();

       SimpleDateFormat formattedDate = new SimpleDateFormat("dd");
       String date = formattedDate.format(currentDate);
       int dateInt = Integer.parseInt(date);
        if(dateInt>=15) {
            System.out.println("It's second half");
        } else {
            System.out.println("It's first half");
        }
    }
}
