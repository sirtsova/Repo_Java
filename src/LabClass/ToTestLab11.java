package LabClass;

import Interview_Prep.Iterview_prep2;

import java.util.Arrays;

public class ToTestLab11 {
    public static void main(String[] args) {
        Lab11 l1 = new Lab11();
        System.out.println(l1.getRidOfHash("test#string###unutella#hagain"));
        String[] names = {"happy", "iamhappytoday", "great day", "hello world", "i am happy", "HAPPYness", "joYfuLlHappY"};
       String [] newString =  l1.toFindNamesLongerThanGivenLength(names, 10);
        System.out.println(Arrays.toString(newString));
        Iterview_prep2 k1 = new Iterview_prep2();
        int[] numbers = {87,5,8,4,2,9,12,55,63};
        k1.findTheSmallestNumber(numbers);
    }
}
