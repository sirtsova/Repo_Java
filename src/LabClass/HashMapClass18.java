package LabClass;

import java.util.*;

public class HashMapClass18 {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(101, "happy");
        myMap.put(10, "job");
        myMap.put(908, "learn");
        myMap.put(1111, "grow");
        myMap.put(76, "HappY");
        Integer checkKey = 22;


        /**
         * Student name: john
         * Student Score: 90, 89, 76, 89, 100
         *
         * Student name: harry
         * Student Score: 70, 89, 76, 89, 100
         *
         * Student name: reene
         * Student Score: 90, 77, 98, 98, 100
         *
         * Student name: domino
         * Student Score: 90, 89, 100, 89, 100
         *
         * Student name: joy
         * Student Score: 89, 89, 77, 89, 98
         *
         * Store the data in a appropriate variable.
         *
         */


        Map<String, List<Integer>> scores2 = new HashMap<>();

        Integer[] johnArray = {90, 89, 76, 89, 100};
        List<Integer> johnScoresList = Arrays.asList(johnArray);
        scores2.put("john", johnScoresList);

        Integer[] harryScores = {70, 89, 76, 89, 100};
        List<Integer> harryScoresList = Arrays.asList(harryScores);
        scores2.put("harry", harryScoresList);

        Integer[] renneScores = {90, 77, 98, 98, 100};
        List<Integer> renneScoresList = Arrays.asList(renneScores);
        scores2.put("renne", renneScoresList);

        Integer[] dominoScores = {90, 89, 100, 89, 100};
        List<Integer> dominoScoresList = Arrays.asList(dominoScores);
        scores2.put("domino", dominoScoresList);

        Integer[] joyScores = {89, 89, 77, 89, 98};
        List<Integer> joyScoresList = Arrays.asList(joyScores);
        scores2.put("joy", joyScoresList);
        Collection<String> keyList = scores2.keySet();
        Map<String, Integer> totalScores = new HashMap<>();
        Collection<List<Integer>> valuesList = scores2.values();

        Collection<String> studentNames = scores2.keySet();
        Map<String, Integer> totalScore = new HashMap<>();

        for (String studentName : studentNames) {
            List<Integer> studentScore = scores2.get(studentName);
            int total = 0;
            for (Integer score : studentScore) {
                total += score;
            }
            totalScore.put(studentName, total);
        }
        int maxScore =0;
        String topper = "";
       Collection<String> keysTotals = totalScore.keySet();
        for(String t: keysTotals) {
            if(totalScore.get(t)>maxScore) {
                maxScore = totalScore.get(t);
                topper = t;
            }
        }

        System.out.println("Topper: "+topper+"\nMax Score: "+maxScore);

    }


    // write code here
    // if value with given key is of length greater than 4 -->
    //      print the value
    // else -->
    //      print 'value not greater than 4'
    // if the given key is not found -->
    //      print 'key not available'


    public static void printAccossiatedKey(Map<Integer, String> myMap) {
        Collection<Integer> keys = myMap.keySet();

        for (Integer key : keys) {
            if (myMap.get(key).length() > 4) {
                System.out.println(key);
            }
        }
    }

}



