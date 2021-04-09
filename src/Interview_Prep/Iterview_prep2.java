package Interview_Prep;

import java.util.Arrays;

public class Iterview_prep2 {
    public static void main(String[] args) {

    }

    public void findTheSmallestNumber (int[] numbers) {
        Arrays.sort(numbers);
        int smallestNumber_1 = numbers[0];
        int smallestNumber = numbers[0];
        for(int i=1;i<numbers.length;i++) {
            if(numbers[i]<numbers[0]){
                smallestNumber = numbers[i];
            }
        }
        System.out.println(smallestNumber + "\n" +smallestNumber_1);
        //return smallestNumber;
    }


}
