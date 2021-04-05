package Interview_Prep;

import LabClass.Lab11;

public class Interview_tasks_1 {
    public static void main(String[] args) {
    //Write a program to swap 2 numbers without a temporary variable
        int a = 20;
        int b = 30;
        System.out.println(a + " - a before swaping");
        System.out.println(b+ " - b before swaping");
        a = a + b; //20+30 ---- a=50;
        b = a - b; //50-30-----b=20;
        a = a - b; //50-20-----a=30;
        System.out.println(a + " - a after swaping");
        System.out.println(b+ " - b after swaping");

        //swap 2 strings without temporary variable
        String x = "Hello";
        String y = "World";
        System.out.println("String x before swaping "+ x);
        System.out.println("String y before swaping "+ y);
        x=x+y; //HelloWorld
        y=x.substring(0,(y.length())); // y index (5-1) =4
        x = x.substring((y.length())); // from index 4
        System.out.println("String x after swaping "+ x);
        System.out.println("String y after swaping "+ y);

        //write a program to check if given number is prime or not
        int given =56;
        boolean isPrime = true;

        if(given>0) {
            for(int i=2;i<given;i++) {
                if(given%i==0) {
                    isPrime=false;
                    break;
                } else {
                    isPrime=true;
                    break;
                }
            }
            System.out.println("Is number " +given+ " Prime? "+isPrime);
        }
        System.out.println("\n\n");
        // write a java program to print the first 10 numbers of Fibonacci series
        int c;
        int j=0;
        int k=1;
        for(int i=1; i<=10;i++) {
            System.out.println(j+" ");
            c=j+k;
            j=k;
            k=c;
        }


        String str = "H6#)iii&&KK    YY $%$#%$ 765456 jgfd";
        str=str.replaceAll("[^A-Za-z]","");
       //[A-z] all characters upper and lower case
       //[^A-Za-z] all alpha chars and numbers and spaces
        String str1= str.replaceAll("[0-9]",""); //
        String str2= str.replaceAll("\\d","");
         int number2 =str2.length();
        int number1 = str1.length();
        int number = str.length();
        System.out.println("Number of alpha character = "+number +" \n string:"+str);
        System.out.println("Number of alpha character = "+number1 +" \n string:"+str1);
        System.out.println("Number of alpha character = "+number2 +" \n string:"+str2);




        }
     }


