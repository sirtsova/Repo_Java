package String_HW;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        //#1

        double studentScore = 400;

        double maxScore = 700;


        double persentageScore = (studentScore / maxScore) * 100;


        if (persentageScore >= 91 && persentageScore <= 100) {

            System.out.println("Your percentage: " + persentageScore + " and your Grade is: A");

        } else if (persentageScore >= 81 && persentageScore <= 90) {

            System.out.println("Your percentage: " + persentageScore + " and your Grade is: B");

        } else if (persentageScore >= 71 && persentageScore <= 80) {

            System.out.println("Your percentage: " + persentageScore + " and your Grade is: C");

        } else if (persentageScore >= 61 && persentageScore <= 70) {

            System.out.println("Your percentage: " + persentageScore + " and your Grade is: D");

        } else if (persentageScore >= 51 && persentageScore <= 60) {

            System.out.println("Your percentage: " + persentageScore + " and your Grade is: E");

        } else if (persentageScore <= 50 && persentageScore >= 0) {

            System.out.println("Your percentage: " + persentageScore + " and your Grade is: F");

        } else {

            System.out.println("Invalid data input. Please try again with a correct value. ");

        }


       //#2


        System.out.println("Enter an integer number:");

        Scanner input = new Scanner(System.in);

        int x;

        x = input.nextInt();

        if (x % 5 == 0 && x % 3 == 0) {

            System.out.println("The integer number you entered is divisible by 5 and 3");

        } else if (x % 5 == 0) {

            System.out.println("The integer number you entered is divisible by 5");

        } else if (x % 3 == 0) {

            System.out.println("The integer number you entered is divisible by 3");

        } else {

            System.out.println("The interger number you entered is not divisible by 3 or 5");

        }
//#3
        char carGear = 'D';

        String driveType = "SnoW";

        switch (carGear) {

            case 'P': {

                System.out.println("you can park the car");

                break;

            }

            case 'N': {

                System.out.println("put car in car wash");

                break;

            }

            case 'R': {

                System.out.println("revere the car");

                break;

            }

            case 'D': {

                switch (driveType.toLowerCase()) {

                    case "snow": {

                        System.out.println("You are on the snow mode");

                        break;

                    }

                    case "sport" : {

                        System.out.println("You are on the sport mode");

                        break;

                    }

                    case "eco": {

                        System.out.println("You are on eco mode");

                        break;

                    }

                       default: {
                        System.out.println("Enter valid command");

                }


            }

        }
        }

    }
}
