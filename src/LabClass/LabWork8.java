package LabClass;

import java.util.Arrays;
import java.util.Locale;

public class LabWork8 {
    public static void main(String[] args) {
        int[] myArray = {76, 96, 45, 32, 44, 12, 33, 87};
        int[] reversedArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            reversedArray[i] = myArray[myArray.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedArray));

        //  System.out.println(arrayOfNum.trim());

        String phararagraph = "schooL is a school tome to SChooL in theschool";
        String[] lowerPhararagraph = phararagraph.toLowerCase().split(" ");
        String wordToFind = "SchooL";
        String lowerWordTOFind = wordToFind.toLowerCase();
        int count = 0;
        for (int i = 0; i < lowerPhararagraph.length; i++) {
            if (lowerPhararagraph[i].contains(lowerWordTOFind)) {
                count++;
            }
        }
        System.out.println(count);


        String[] words =  {"peace", "Happy", "happiness", "haPPy", "grow", "happYss", "Learn", "Help", "HappY", "Listen", "Peace"};
        String wordTofind = "happy";

        int l = 0;
        for(int k=0; k< words.length; k++){
            if(words[k].equalsIgnoreCase(wordTofind)) {
               l++;
            }
        }
        int j = 0;
        int[] indexOfFoundWord = new int[l];
        for (int h = 0; h < words.length; h++) {
            if (words[h].equalsIgnoreCase(wordTofind)) {
                indexOfFoundWord[j] = h;
j++;
            }
        }
        System.out.println(Arrays.toString(indexOfFoundWord));
    }
}



