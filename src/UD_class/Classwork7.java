package UD_class;

import java.sql.SQLOutput;
import java.util.Locale;

public class Classwork7 {
    public static void main(String[] args) {
        String sentence_3 = "happy new year";
        String [] arrOfLetters = sentence_3.split("");
        String[] letters = sentence_3.toLowerCase().split("");
        int count = 0;
        for (int i=0; i<letters.length; i++) {
            if (letters[i].contains("a") || letters[i].contains("u")|| letters[i].contains("i")
            ||letters[i].contains("o") || letters[i].contains("e")) {
                count++;
            }
        }
        System.out.println("Count of vowels in the sentence_3 : "+count);
int count2 =0;
        for (String newLetters : arrOfLetters) {
            if (newLetters.equalsIgnoreCase("a") || newLetters.equalsIgnoreCase("u")
                || newLetters.equalsIgnoreCase("i") || newLetters.equalsIgnoreCase("o")
                || newLetters.equalsIgnoreCase("e"))  {
                count2++;
            }
        }
        System.out.println("Count of vowels in the sentence_3(enhanced loop) : "+count2);
    }
}
