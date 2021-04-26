package Classwork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        Map<String, Integer> colorCount = new HashMap<>();
        colorCount.put("green", 10);
        colorCount.put("red", 21);
        colorCount.put("blue", 43);
        colorCount.put("orange", 12);
        colorCount.put("violet", 10);
        colorCount.put("pink", 65);
        colorCount.put("white", 7);
        colorCount.put("black", 10);

        Collection<Integer> valuesColor =colorCount.values();


        System.out.println(colorCount.remove("green"));


 }
    }

