package Classwork;

import java.util.Locale;

public class ClassWork9 {
    public static void main(String[] args) {
        System.out.println(devide2Num(6,3));
        greetingUser("  HHHH Bhgff jhgfdfghj  ");

    }
    public static double devide2Num (double num1, double num2) {
        double result =num1/num2;
        return result;
    }

    public static void  greetingUser (String firstName) {
        if (firstName.trim().length()==0) {
            System.out.println("Hello user");
        } else {
            String[] trimmedFName = firstName.trim().toLowerCase().split("");
            String charFirst = trimmedFName[0].toUpperCase().substring(0,1);
            String remainingName =trimmedFName[0].substring(1);
            firstName = charFirst+remainingName;
            System.out.println("Hello "+firstName);
        }

    }
}
