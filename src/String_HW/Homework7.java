package String_HW;

import java.util.Locale;

public class Homework7 {
    public static void main(String[] args) {
        /**
         * String sentence1 =  "hApPY nEW yeAr";
         * sout(sentence1);  // hApPY nEW yeAr
         * // code
         * sout(sentence1);  // Happy New Year
         */

        String sentence1 = "hApPY nEW yeAr";
        System.out.println(sentence1);
        String sentenceLower = sentence1.toLowerCase();
        String[] sentenceArr = sentenceLower.split(" "); // "happy", "new", "year"
        sentence1="";
        for (String words : sentenceArr) {
            String firstLetter = words.toUpperCase().substring(0, 1);
            String remainingLetters = words.substring(1);
            String sentenceModified = firstLetter.concat(remainingLetters+ " ");
            sentence1 = sentence1+ sentenceModified;


            }
        System.out.print(sentence1);



            System.out.println("\n");
            /**
             * Create abbreviation:
             * String sentence2 =  "Lab sessIONS clAsses";
             * // code
             * LSC
             *
             */
            String sentence2 = "Lab sessIONS clAsses";
            String[] sentence_2_Arr = sentence2.split(" ");
            for (int i = 0; i < sentence_2_Arr.length; i++) {
                String abbreviationLetter = sentence_2_Arr[i].substring(0, 1).toUpperCase();
                System.out.print(abbreviationLetter);
            }

            System.out.println("\n");

            /**
             * Reverse a string
             *
             */
            // String sentence3 = "happy holidays";
            // String reverseSentence3 = "";
            //  System.out.println("sentence3 : " + sentence3);     // happy holidays
            // code
            // System.out.println("Reverse sentence3 : " + reverseSentence3);  // syadiloh yppah
            String sentence3 = "happy holidays";

            System.out.println("sentence3 : " + sentence3);
            String reverseSentence3 = "";
            System.out.print("Reverse sentence3 : ");
            for (int i = sentence3.length() - 1; i >= 0; i--) {
                System.out.print(sentence3.charAt(i));
            }
        }
}







