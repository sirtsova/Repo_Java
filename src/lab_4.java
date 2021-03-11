import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Locale;

public class lab_4 {
    public static void main(String[] args) {

String myName = "valeRiYa";
char taskResult = myName.length()>10 ? myName.charAt(0) : myName.charAt(myName.length()-1);
        System.out.println(taskResult);

        String taskResult2 = myName.length()>10 ? myName.substring(0,1) : myName.substring(myName.length()-1);
        System.out.println(taskResult2);
        String firstChar=myName.substring(0,1).toUpperCase();
        String remainingLetters=myName.substring(1).toLowerCase();
        System.out.println(firstChar+remainingLetters);
        System.out.println(myName.trim().length());

        String sentance_11 ="Happy peace Grow";
        String sentanceLower = sentance_11.toLowerCase();
       int indexResult = sentanceLower.contains("a")||sentanceLower.contains("e")
               || sentanceLower.contains("i") || sentanceLower.contains("o")||
               sentanceLower.contains("u")
               ? sentanceLower.indexOf("a") : sentanceLower.indexOf("z");
        System.out.println(indexResult);


            }

}
