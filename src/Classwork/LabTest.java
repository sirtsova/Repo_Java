package Classwork;

public class LabTest {
    public static void main(String[] args) {
        /* Harry's favourite number is X and Sam's favourite number is Y.
                A non-empty array Arr consisting of N integers is given.
        Harry and Sam are interested in occurrences of their favourite numbers X and Y in array Arr.
                They are looking for the longest leading fragment (prefix) of array Arr in which there is one occurrence of X and Y. Formally, they are looking for the longest P such that P<=N and the number of occurrences of X equals the number of occurrences of Y in the array Arr.
                For example, consider:
        X=7 and Y=42 and Arr={6, 42, 11, 7, 1, 42}
        Ans -> 4    (bcz, upto index-4 i.e. {6, 42, 11, 7, 1} ; 7 and 42 are present equal number of times)
        X=6  Y=13  Arr={13, 13, 1, 6}
        Ans -> -1  (bcz, there is no portion of Arr where 6 and 13 are in equal numbers)
        X=100  Y=63  Arr={100, 63, 100, 6, 2}
        And -> 1 (bcz, upto index-1 i.e. {100, 63} ; 100 and 63 are present equal number of times)
        X=10  Y=64  Arr={10, 32, 100, 64, 2, 55, 22}
        And -> 6 (bcz, upto index-6 i.e. {10, 64, 100, 6, 2, 55, 22} ; 10 and 64 are present equal number of times)

         */
        System.out.println("\nCase 1:");
        int x1 = 7;
        int y1 = 42;
        int[] arr1 = {6, 42, 11, 7, 1, 42};
        System.out.println(findPrefix(x1,y1,arr1));

        System.out.println("\nCase 2:");
        int x2 = 6;
        int y2 = 13;
        int[] arr2 = {13, 13, 1, 6};
        System.out.println(findPrefix(x2,y2,arr2));

        System.out.println("\nCase 3:");
        int x3 = 100;
        int y3 = 63;
        int[] arr3 = {100, 63, 100, 6, 2};
        System.out.println(findPrefix(x3,y3,arr3));

        System.out.println("\nCase 4:");
        int x4 = 10;
        int y4 = 64;
        int[] arr4 = {10, 32, 100, 64, 2, 55, 22};
        System.out.println(findPrefix(x4,y4,arr4));

    }
        public static int findPrefix ( int x, int y, int[] arr) {
            int count = 0;
            int count2 = 0;
            int p = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    count++;
                    if (count == 2) {
                        p = i - 1;
                        break;
                    }
                }
                if (arr[i] == y) {
                    count2++;
                    if (count2 == 2) {
                        p = i - 1;
                        break;
                    }
                }
            }

            if (p == 0) {
                p = -1;
            }
            if (count == 1 && count2 == 1) {
                p = arr.length - 1;
            }
            return p;
        }

}
