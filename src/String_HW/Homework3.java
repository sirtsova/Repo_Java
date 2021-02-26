package String_HW;

public class Homework3 {
    public static void main(String[] args) {

        /*C -> F
        T(°F) = T(°C) × 9/5 + 32
         */
        double cTemp = 21;
        double fTemp = cTemp * 9/5 +32;
        System.out.println(cTemp + "C° = "+fTemp + "F°");

        /*C -> K
         * T(K) = T(°C) + 273.15
         */
        double kTemp = cTemp + 273.15;
        System.out.println(cTemp + "C° = "+kTemp + "K");





        /* F -> C
        T(°C) = (T(°F) - 32)*5/9
         */
        double cTemp2 = (fTemp - 32)*5/9;
        System.out.println(fTemp + "F° = "+ cTemp2 + "C°");

        /* F -> K
         T(K) = (T(°F) + 459.67)× 5/9
         */
        double kTemp2 = (fTemp + 459.67)* 5/9;
        System.out.println(fTemp+"F° = "+ kTemp2+"K");





        /* K -> F
        T(°F) = T(K) × 9/5 - 459.67
         */
        double fTemp3 = kTemp2 *9/5 - 459.67;
        System.out.println(kTemp2+"K = "+fTemp3+"F°");

        /* K -> C
        T(°C) = T(K) - 273.15
         */
        double cTemp3 = kTemp2 -273.15;
        System.out.println(kTemp2+ "K = "+cTemp3+"C°");
    }
}
