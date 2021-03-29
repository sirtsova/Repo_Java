package LabClass;

import java.util.Arrays;

public class LabWork9 {
    public static void main(String[] args) {

    }



    public static void getNameMaxLength  (String[] names) {
        String [] namesS = {"Happy", "hello", "new", "crazzzzzyy"};
        int[] lengthOfNames = new int[names.length];

        for (int i=0;i< names.length;i++) {
           lengthOfNames[i] = names[i].length();
                   }
        System.out.println(Arrays.toString(lengthOfNames));
    }

}
