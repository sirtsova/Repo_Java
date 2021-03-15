package UD_class;

import java.util.Locale;

public class ClassWork6 {
    public static void main(String[] args) {
        String monthName = "deceMbeR";
        switch (monthName.trim().toLowerCase()) {
            case "february":
            case "january":
            case "december":
                System.out.println("Winter season");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Autumn season");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer season");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring season");
                break;
            default:
                System.out.println("Invalid month name -->" + monthName);
                break;

        }
    }
}
