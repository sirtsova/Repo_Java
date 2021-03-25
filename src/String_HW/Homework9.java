package String_HW;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
        /**
         * Write a method to convert given string into Titlecase
         */
        System.out.println(titleCase("hellO mY naMe iS CaRoLINe"));
        /**
         * Write a method that will tell grade to student for given score and MaxScore
         */
        System.out.println(studentGrade_result(500, 900));
        /**
         * Write a method that will reverse any given int-array
         */
        int[] intArray = {66,876,65,34,987,343,21};
        System.out.println(Arrays.toString(reverseIntArr(intArray)));
        /**
         * Write a method that return the number of words in given sentence.
         */
        System.out.println(numberOfWords(" Ha pppy Ne W       Year     "));
    }
    public static String titleCase (String sentence) {
        String sentenceLower = sentence.toLowerCase();
        String[] sentenceArr = sentenceLower.split(" "); // "happy", "new", "year"
        sentence="";
        for (String words : sentenceArr) {
            String firstLetter = words.toUpperCase().substring(0, 1);
            String remainingLetters = words.substring(1);
            String sentenceModified = firstLetter.concat(remainingLetters+ " ");
            sentence = sentence+ sentenceModified;
        }
        return sentence;
    }
    public static String studentGrade_result (double studentScore , double maxScore) {
        double persentageScore = (studentScore / maxScore) * 100;
        String studentGrade = "";
        if (persentageScore >= 91 && persentageScore <= 100) {
             studentGrade ="Your percentage: " + persentageScore + " and your Grade is: A";
        } else if (persentageScore >= 81 && persentageScore <= 90) {
             studentGrade ="Your percentage: " + persentageScore + " and your Grade is: B";
        } else if (persentageScore >= 71 && persentageScore <= 80) {
             studentGrade ="Your percentage: " + persentageScore + " and your Grade is: C";
        } else if (persentageScore >= 61 && persentageScore <= 70) {
             studentGrade ="Your percentage: " + persentageScore + " and your Grade is: D";
        } else if (persentageScore >= 51 && persentageScore <= 60) {
             studentGrade ="Your percentage: " + persentageScore + " and your Grade is: E";
        } else if (persentageScore <= 50 && persentageScore >= 0) {
             studentGrade = "Your percentage: " + persentageScore + " and your Grade is: F";
        } else {
             studentGrade ="Invalid data input. Please try again with a correct value.";
        }
        return studentGrade;
    }
public static int[] reverseIntArr (int[] intArray) {
    int[] reversedArray = new int[intArray.length];
    for (int i = 0; i < intArray.length; i++) {
        reversedArray[i] = intArray[intArray.length - 1 - i];

    }
    return reversedArray;
}
    public static int numberOfWords (String sentence_2) {
       String[] arrSentence = sentence_2.trim().split(" ");
       int count =0;
       for (int i=0; i<arrSentence.length; i++) {
           if (i<= arrSentence.length) {
               if(!(arrSentence[i].trim().length()==0)) {
                   count++;
               }
           }
       }
       return count;
    }
}
