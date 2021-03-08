package String_HW;


import java.util.Arrays;
import java.util.Locale;

public class Homework4 {
    public static void main(String[] args) {
        String sentence_3 = "hello dear, how are you?";
        /**
         * Assign result as true if length of sentence_3 is greater than 10
         * else assign false
         *
         * Hint: use ternary operator
         */
        int lengthOfSent_3=sentence_3.length();
        boolean sentence_3_result = lengthOfSent_3>10 ? true : false;
        System.out.println(sentence_3_result);

        String sentence_4 = "We all ARe Good ProgRommeR";
        /**
         *  1. Replace all 'r' with 'f' (Ignore cases)
         */
        System.out.println(sentence_4.replaceAll("(?i)r","f"));
        System.out.println(sentence_4.replace("r","f").replace("R","f"));

        String fullName = "Valeriya Sirtsova";
        /**
         * 1. Display the length of your fullname.
         * 2. Does your name start with 'K' (ignore cases)
         * 3. Does your full name contain 'a' (ignore cases)
         */
        System.out.println(fullName.length());
        boolean startsWithK = fullName.startsWith("K") || fullName.startsWith("k") ? true : false;
        System.out.println(startsWithK);
        boolean startsWithK_2 =fullName.toUpperCase().startsWith("K") ? true : false;
        System.out.println(startsWithK_2);
        boolean contain_a=fullName.toLowerCase().contains("a") ? true : false;
        System.out.println(contain_a);





    }
}
