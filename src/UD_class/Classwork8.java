package UD_class;

public class Classwork8 {
    public static void main(String[] args) {
        char [] letters = {'A','B','C','D','E'};
        int j =0;
        while (j<letters.length) {
            System.out.println("Letter at index "+j + " : " +letters[j]);
            j++;
        }
        System.out.println("\n\n");
        for (int i=0; i<letters.length; i++) {
            System.out.println("Letter at index "+i + " : " +letters[i]);
        }
        System.out.println("\n\n");
        int k=0;
        for( char loopLetters : letters){
            System.out.println("Letter at index "+ k + " : " +loopLetters);
            k++;
        }
    }
}
