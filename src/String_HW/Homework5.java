package String_HW;

public class Homework5 {
    public static void main(String[] args) {
        String fullNameRegular = "    Valeriya-SirtsovA      ";
        String fullNameTrimed = fullNameRegular.trim();
        /**
         *  * 1. Does first name start with 'K' (ignore cases)
         * 2. If user has a last name, Does last name ends with 'a' (ignore cases)
         *    else print, "No last name entered"
         * 3. If user has a last name, print the 1st letter of last name
         *      else print, "No last name entered"
         * 4. Print the number of letters in the first name.
         */
        String[] fullNameArr = fullNameTrimed.split(" ");
        boolean startsWith_K = fullNameArr[0].toUpperCase().startsWith("K");
        System.out.println("Does first name start with 'K'? --> " + startsWith_K);

        if (fullNameArr.length >= 2) {
            boolean isEquals = fullNameTrimed.toLowerCase().charAt(fullNameTrimed.length() - 1) == 'a';
            System.out.println("Does last name ends with 'a'? --> " + isEquals);
        } else {
            System.out.println("No last name entered");
        }


        if (fullNameArr.length >= 2) {
            int lastIndexOfArr = fullNameArr.length - 1;
            System.out.println("1st letter of last name is --> " + fullNameArr[lastIndexOfArr].charAt(0));
        } else {
            System.out.println("No last name entered");
        }


        String firstName = fullNameArr[0];
        System.out.println("Number of letters in the last name --> " + firstName.length());


        /**
         * String threeWordsSentence_1 =  "hApPY nEW yeAr";
         * sout(threeWordsSentence_1);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence_1);  // Happy New Year
         */
        String threeWordsSentence_1 = "hApPY nEW yeAr";
        System.out.println(threeWordsSentence_1);
        String[] wordsArr = threeWordsSentence_1.toLowerCase().trim().split(" ");

        String firstWord = wordsArr[0];
        String secondWord = wordsArr[1];
        String thirdWord = wordsArr[2];
        char firstWordChar = firstWord.toUpperCase().charAt(0);
        char secondWordChar = secondWord.toUpperCase().charAt(0);
        char thirdWordChar = thirdWord.toUpperCase().charAt(0);
        String remainingFirstWordLetters = firstWord.substring(1);
        String remainingSecondWordLetters = secondWord.substring(1);
        String remainingThirdWordLetters = thirdWord.substring(1);
        System.out.println(firstWordChar + remainingFirstWordLetters + " "
                + secondWordChar + remainingSecondWordLetters + " " + thirdWordChar + remainingThirdWordLetters);

        //other way to solve the problem
        for (int i = 0; i <=wordsArr.length-1; i++) {
            Object indexZero = wordsArr[i].toUpperCase().charAt(0);
            String remainingValue = wordsArr[i].toLowerCase().substring(1);
            System.out.print(indexZero + remainingValue + " ");
            if (i == wordsArr.length-1) {
                break;
            }
        }

        System.out.println("  ");
        /**
         * Create abbreviation:
         * String threeWordsSentence_2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        String threeWordsSentence_2 =  "Lab sessIONS clAsses";
        String threeWordsLowerCase = threeWordsSentence_2.toLowerCase();
        String[] arrOfWords2 = threeWordsLowerCase.trim().split(" ");
        for (int i=0; i<= arrOfWords2.length-1; i++) {
            char upperCaseZeroIndexChar=arrOfWords2[i].toUpperCase().charAt(0);
            System.out.print(upperCaseZeroIndexChar);
            if (i==arrOfWords2.length-1){
                break;
                }

        }
        System.out.println(" ");
        /**
         * String sentence_4 = "We all are here to learn good stuff";
         * Print the number of words in the sentence.
         *
         */
        String sentence_4 = "We all are here to learn good stuff";
        String[] arraySentence_4= sentence_4.trim().split(" ");
        System.out.println(arraySentence_4.length);
        }


    }


