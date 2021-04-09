package Classwork;

import java.util.Arrays;

public class CodeTestToTest {
    public static void main(String[] args) {


        CodeTest c1 = new CodeTest();
        c1.speedLimitPoints(130);

        int[] numbers = {24,32,54,78,24,80,24,32,32,11,34};
        System.out.println(Arrays.toString(numbers));
        numbers = c1.removeNumberFromArray(numbers,32);
        System.out.println(Arrays.toString(numbers));

        int [] findSmallest = {0,5,-1,3,3,7,1,2,8,4};
        int[] small = {3,5,1,4,2,7};
        int[] smallest2 = {-1,-3,4,2};
        //int [] findSmallest = {2,4,5,7,8,10,11,12,1};
        System.out.println(c1.smallestMissingNum(smallest2));
    }
}