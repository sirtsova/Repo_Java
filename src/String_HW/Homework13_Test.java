package String_HW;

public class Homework13_Test {
    public static void main(String[] args) {


        Homework13 h3 = new Homework13();

        String[] arr = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        System.out.println(h3.hasDuplicates(arr));
        h3.valuesOccurMoreThanOneTime(arr);
    }
}
