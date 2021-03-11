package UD_class;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class String_Concept {
    public static void main(String[] args) {
        String myName = " Valeriya";
        char characterIndex4 = myName.charAt(4); //get character by index
        System.out.println(characterIndex4);
        System.out.println(myName.indexOf("a")); //get index by character
        System.out.println(myName.substring(2,6)); //output "aler" printing chars between 2 and 6
        System.out.println(myName.substring(4)); //output "eriya" starts with 4 index till the last one
        System.out.println(myName.concat(" Sirtsova")); //prints together "Valeriya Sirtsova"
        System.out.println(myName.trim()); // prints "Valeriya" without space in the 0 index
        myName.toUpperCase();
        myName.toLowerCase();
        myName.split("r");


        String helloW = "Hello World";
        int leOfTheString =helloW.length();
        int lastIndex=leOfTheString - 1;
        System.out.println(helloW.charAt(lastIndex));
        System.out.println(helloW.indexOf('f'));

        String forPractice = "New York";
        System.out.println(forPractice.contains("new"));

String cityName = "New York";
        String cityNameReplaceMultiple =  cityName.replace("w Y", "-Hello-");
        System.out.println("\nCityName : " + cityName);
        System.out.println("CityName after replace multiple : " + cityNameReplaceMultiple);
        System.out.println(cityName.charAt(2));

        String cityNameFrom10 = cityName.substring(2,8);     // "ity in the town"
        System.out.println("\ncityName : " + cityName);
        System.out.println("cityNameFrom10 : " + cityNameFrom10);
        String cityName_String = "New york city in the town";

        String[] afterSplitBy_o = cityName_String.split("o");
        System.out.println("\ncityName_String :  " + cityName_String);
        // System.out.println("Array after split (direct variable): " + afterSplitBy_o);
        // shortcut to print Array values
        System.out.println("Array after split by 'o': " + Arrays.toString(afterSplitBy_o));


                String x = "abc";
                String y = "abz";
                String yx=x.concat(y);
                System.out.print(yx);

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.print(s1==s2);
        System.out.println(s1==s2.intern());

        String s12="java string";
        s12.concat("is immutable");
        System.out.println(s12);

    }
}
