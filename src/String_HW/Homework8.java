package String_HW;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        /**
         * task 1:
         * Add all the numbers from given array,
         * and store final result in "total" variable
         */
        double[] doubleArray = {11.23, 43.3, 34, 65.76, 87};

        //create int total
        //loop doubleArray from 0 to double.length-1
        //total = total +doubleArray[i];
        double total = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            total = total + doubleArray[i];
        }
        System.out.println("The total of doubleArray is: " + total);


        /**
         * task 2:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable
         * palindrome: string which reads the same in reverse
         * eg:
         * level --> level  (palindrome)
         * eye  --> eye     (palindrome)
         * head --> daeh    (not palindrome)
         */
        String word = "LEveL";

        //split by nothing to get array of letters
        //create for loop to reverse string
        // store result into reversed variable
        //verify if words equals to reversed and put result in the variable isPolindrome

        String reversed = "";
        String[] wordArr = word.split("");

        for (int i=wordArr.length-1; i>=0; i--) {
          reversed= reversed + wordArr[i];
        }
        reversed = reversed.trim();
        boolean isPolindrome = word.equalsIgnoreCase(reversed);
        System.out.println(isPolindrome);


        /**
         * task3:
         * Find if the value stored in num variable is a prime number or not.
         * And, store the final result in "isPrime" variable
         * prime number -> number which is ONLY divisible by 1 and itself.
         * eg:
         * 5 -> prime
         * 7 -> prime
         * 10 -> not a prime
         */
        System.out.println("Enter an integer number:");
        Scanner input = new Scanner(System.in);

        int number;

        number = input.nextInt();

        boolean isPrime = true;
      /*  if ((number>3 && number%2 == 0) || (number>4 && number%3==0)
        || (number>6 && number%5==0) || (number>8 && number%7==0)) {
            isPrime = false;
        }  else {
            isPrime=true;
        }
*/  for (int i=2; i<9; i++) {
        if (number%i==0) {
          if (number==1 || number==2 ||
             number==3 || number==5 ||
             number==7) {
               isPrime = true;
               } else {
               isPrime = false;
                       }
                          }
                             }
        System.out.println("Number: "+number+" is prime --> "+isPrime);
    }
}

