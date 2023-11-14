package DayTry;

import java.util.Arrays;
import java.util.Scanner;

public class Day03 {
    public static void main(String[] args){
        String s1 = "Mohamed Bahir Hussain";
        //s1 = s1.replaceFirst("Mohamed", "Ahamed");
        System.out.println(s1);

        String cw = "Mohamed";

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == cw.charAt(0)){
               for(int j=i; j<cw.length(); j++){
                   if (cw.charAt(j) == s1.charAt(i)) {
                       System.out.println("Hello");
                       break;
                   }
               }
               break;
            }
            else {
                System.out.println("Not find in here");

            }
        }
    }
}
