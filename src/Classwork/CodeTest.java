package Classwork;

import java.util.Arrays;

public class CodeTest {
    public static void main(String[] args) {

    }
    private int speedLimit = 70;
    public void speedLimitPoints (int enterSpeed) {
        if(enterSpeed <=70 && enterSpeed>0) {
            System.out.println("Thank you for driving within the speed limit");
        } if(enterSpeed>70 && enterSpeed<130) {
            int points = (enterSpeed-70)/5;
            if(points>0) {
                System.out.println("Your speed is " + enterSpeed + " which is grater than allowed. You got " + points + " points to your driver licence.");
            } else {
                System.out.println("You got " + points +" for right now. Make sure you drive within the speed limit next time.");
            }
        } if(enterSpeed>=130) {
            int points = (enterSpeed-70)/5;
            System.out.println("You got "+ points+ ". Your licence suspended.");
        } if (enterSpeed<=0) {
            System.out.println("Enter valid speed");
        }

    }

    public int[] removeNumberFromArray (int [] intArray , int numberToRemove) {
        int count = 0;
        for (int i=0; i<intArray.length;i++) {
            if(numberToRemove==intArray[i]) {
                count++;
            }
        }
        count = intArray.length-count;

        int [] returnedArray = new int[count];
        int j = 0;
        for (int i=0; i<intArray.length; i++) {
            if(!(numberToRemove==intArray[i])) {
                returnedArray[j] = intArray[i];
                j++;
            }
        }
        return returnedArray;
    }


    public int smallestMissingNum (int[] numArray) {
        Arrays.sort(numArray);
        /*int j = 1;
        for (int i=0; i<numArray.length-1; i++) {
            if(numArray[i]>0) {
                if(!(numArray[i]+1==numArray[i+1]) && numArray[i]!=numArray[i+1]) {
                    j = numArray[i];
                    break;
                    }
                }
        }
        return j+1; */
       int  count=0;
        for (int i=0;i<numArray.length;i++) {
            if(numArray[i]>0) {
                      count++;
            }
        }
        int[] numbersAAA = new int[count];
        int k = 0;
        for(int i=0;i<numArray.length;i++) {
            if(numArray[i]>0){
                numbersAAA[k] = numArray[i];
                k++;
            }
        }
        int count2 = 0;
        for (int i=0;i<numbersAAA.length;i++) {
            if (i < numbersAAA.length - 1) {
                if (numArray[i] != numArray[i + 1]) {
                    count2++;
                }
            } if(i==numbersAAA.length-1) {
               if(numbersAAA[i]!=numbersAAA[i-1]+1) {
                   count2++;
               }
            }
        }
       int[] newArraySorted = new int[count2];
        int jk = 0;
        for(int i=0;i<numbersAAA.length-1;i++) {
            if(i<numbersAAA.length-1) {
                if (numbersAAA[i] != numbersAAA[i + 1]) {
                    newArraySorted[jk] = numbersAAA[i];
                    jk++;
                    break;
                }
            } if(i==numbersAAA.length-1) {
                if(numbersAAA[i]!= numbersAAA[i-1]+1) {
                    newArraySorted[jk] =numbersAAA[i];

                }
            }

        }
        int l = 1;
        int smallest = 0;
        for( int i=0; i<newArraySorted.length; i++) {
            if(newArraySorted[i]==l) {
                l++;
            } if(newArraySorted[i]!=l) {
               smallest = newArraySorted[i];
               break;
            }
        }
        return smallest+1;
    }

   }
