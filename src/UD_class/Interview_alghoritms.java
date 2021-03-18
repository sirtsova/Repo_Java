package UD_class;

public class Interview_alghoritms {
    public static void main(String[] args) {
        //  How to reverse a String in java? Can you write a program without using any java inbuilt methods?
        String myString = "Valeriya Sirtsova63424";

        for (int i = myString.length() - 1; i >= 0; i--) {
            System.out.print(myString.charAt(i));
        }

        String[] wordsArr = {"hello", "peace", "valerie", "smile", "cat", "long", "short", "mine", "yours"};
        int x = wordsArr.length - 1;
        for (int i = wordsArr.length - 1; i >= 0; i--) {
            System.out.println(wordsArr[i] + " ");
        }


        for (int i = 1; i < 5; i++) {
            System.out.println("hello");
        }
        System.out.println("\n");
        for (int i = 0; i < wordsArr.length; i+=2) {

            System.out.println(wordsArr[i]);
        }

        }
    }





