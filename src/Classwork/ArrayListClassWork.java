package Classwork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassWork {
    public static void main(String[] args) {


        String[] words = {"happy", "peace","grow", "words", "valeria", "month","grow","grow"};
        List<String> arrList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
           arrList.add(words[i]);
        }
        System.out.println(arrList);
       int count = 0;
       for (int i=0;i<arrList.size();i++) {
            if(arrList.get(i).equalsIgnoreCase("grow")){
                count++;
            }
           }
        System.out.println(count);

    }
}
