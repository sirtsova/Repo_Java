package LabClass;

import java.util.Arrays;

public class Lab11 {
    public static void main(String[] args) {
        int[] numArr = {110008, 0, 0, 0, 7, 8};
        //find max number
        int maxNum = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] > maxNum) {
                maxNum = numArr[i];
            }
        }
        System.out.println(maxNum);
    }



    public String getRidOfHash(String sentance) {

        String[] sentanceArr = sentance.split("");
        int count = 0;
        for (int k = 0; k < sentanceArr.length; k++) {
            if (sentanceArr[k].contains("#")) {
                count++;
            }
        }
        int l = 0;
        int[] hashOfArray = new int[count];
        for (int i = 0; i < sentanceArr.length; i++) {
            if (sentanceArr[i].contains("#")) {
                hashOfArray[l] = i;
                l++;
            }
        }

        for (int u = 0; u < hashOfArray.length; u++) {
            int startsIndex = hashOfArray[u] - 1;
            int lastIndex = hashOfArray[u] + 2;
            if (lastIndex >= sentanceArr.length - 1) {
                sentance = sentance.replaceAll(sentance.substring(startsIndex), "   ");
            } else {
                sentance = sentance.replaceAll(sentance.substring(startsIndex, lastIndex), "   ");
            }
        }
        String[] newSentance = sentance.split("\\s+");


        sentance = "";
        for (int o = 0; o < newSentance.length; o++) {
            sentance = sentance + newSentance[o];
        }

        return sentance;
    }
   /*
        In the given array find names with length greater than users given length
        name: find name by length
        inputs: string[], int
        return type: string []
        {"happy","iamhappytoday","great day","hello world", "i am happy", "HAPPYness", "joYfuLlHappY"}
        1. count the names with length greather than uset given name
        2. create string array to store those values
        3.
   */

    public String[] toFindNamesLongerThanGivenLength(String[] names, int givenLength) {
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > givenLength) {
                count++;
            }
        }
        String[] namesLongerThanGivenLength = new String[count];
        int k = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > givenLength) {
                namesLongerThanGivenLength[k] = names[i];
                k++;
            }
        }
        return namesLongerThanGivenLength;
    }


}

