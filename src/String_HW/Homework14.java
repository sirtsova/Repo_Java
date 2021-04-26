package String_HW;

import java.util.*;

public class Homework14 {

    public static void main(String[] args) {

        /**
         * Question 1:
         * Create a method, that will return all duplicates values with count from the given List<String>
         * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         * Output:
         *      happy - 2
         *      joy - 3
         *      laugh - 2
         */
        System.out.println("\nTask#1");
        String[] words = {"happy", "peace", "peace", "joy", "grow", "joy", "laugh", "happy", "happy", "laugh", "joy"};
        List<String> words1 = Arrays.asList(words);
        System.out.println(Homework14.findCountOfColorsDuplicates(words1));


        /**
         *
         * Question 2:
         * Create a hashMap with any numbers of key-value pairs from the user
         * Key should be Integer
         * Value should be String
         *
         * Create method that will print the keys with same value, else "All keys have different values"
         *
         * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
         * Output (print) ->
         *      "happy" with keys -> 101, 103, 106
         *      "peace" with keys -> 102, 105
         *
         * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
         * Output (print) ->
         *      All keys have different values
         *
         *
         */
        System.out.println("\nTask#2");
        HashMap<Integer,String> match = new HashMap<>();
        match.put(101,"happy");
        match.put(102,"peace");
        match.put(103,"Happy");
        match.put(104,"learn");
        match.put(105,"PeAcE");
        match.put(106,"HAPPY");
        Homework14.sameValues(match);


        /**
         * Question 3:
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */
        System.out.println("\nTask#3");
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};

        System.out.println(Homework14.maxCountColor(arr));

    }

    public static HashMap<String, Integer> findCountOfColorsDuplicates (List<String> words) {
        HashMap<String,Integer> duplicatesCount = new HashMap<>();
        for (String temp : words) {
            if(duplicatesCount.get(temp)!= null) {
                duplicatesCount.put(temp,duplicatesCount.get(temp)+1);
            }
            else {
                duplicatesCount.put(temp, 1);
            }
        }
        Collection<String> setKeyColors = duplicatesCount.keySet();
        HashMap<String, Integer> duplicatesFinal = new HashMap<>();
        for(String h: setKeyColors) {
            if(duplicatesCount.get(h)>1) {
                duplicatesFinal.put(h,duplicatesCount.get(h));
            }
        }

        return duplicatesFinal;
    }

    public static HashSet<String> maxCountColor (String[] colors) {
        HashMap<String,Integer> colorsMap = new HashMap<>();

        for(String s: colors) {
            if(colorsMap.containsKey(s)) {
                colorsMap.put(s,colorsMap.get(s)+1);
            } else {
                colorsMap.put(s,1);
            }
        }

        Collection<String> keyColors = colorsMap.keySet();
        HashSet<String> maxCountC = new HashSet<>();
        int maxValue = 0;
        for(String s: keyColors) {
            if(colorsMap.get(s)>maxValue) {
                maxValue = colorsMap.get(s);
            }
        }
        for(String s: keyColors) {
            if(colorsMap.get(s)==maxValue) {
                maxCountC.add(s);
            }
        }
        return maxCountC;

        }

        public static void sameValues (HashMap<Integer,String> idWords) {
        Collection<String> valuesWords = idWords.values();
        Collection<Integer> keysNum = idWords.keySet();

        HashMap<String,List<Integer>> matches = new HashMap<>();
        HashSet<String> words = new HashSet<>();


        for(String s : valuesWords) {
            words.add(s.toLowerCase());
        }


        for(String w :words) {
            List<Integer> k = new ArrayList<>();
            for(Integer i : keysNum) {
                if(w.equalsIgnoreCase(idWords.get(i))) {
                    k.add(i);
                    matches.put(w, k);


    }
}

}
        Collection<List<Integer>> matchesValues =matches.values();
        Collection<String> matchesKeys =matches.keySet();
        int count = 0;
        for(String s: matchesKeys) {
            if(matches.get(s).size()>1) {
               System.out.println(s+" with keys--> "+matches.get(s));
           }
            if(matches.get(s).size()<=1) {
                count++;
                if(count==matchesValues.size()) {
                    System.out.println("All keys have different value");
                }
            }
        }


}

}