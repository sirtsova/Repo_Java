package String_HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Homework13 {

    public static void main(String[] args) {

        /**
         * Question 1:
         * Create a method that can find if the given array has any duplicate data or not?
         */


        /**
         * Question 2:
         * Create a method that would return the values occurring more than one time in given string-array
         *
         * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         *
         */

        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};
        /**
         * Question 3:
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */


    }

    public boolean hasDuplicates(String arr[]) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        if (set.size() == arr.length) {
            return false;
        } else {
            return true;
        }
    }

    public void valuesOccurMoreThanOneTime(String arr[]) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        List<String> wordsList = Arrays.asList(arr);
        for (int i = 0; i < wordsList.size(); i++) {
            if (set.contains(wordsList.get(i))) {
                wordsList.remove(i);
                set.remove(i);
                i = -1;
            }
        }
        System.out.println(wordsList);

    }


}




