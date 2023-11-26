package DayTry;

import java.util.HashSet;

public class Day07 {
    public static void main(String[] args){
        String s = "dbsjhvsd(*$^%$%^34gvhhb";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>= 'a' && 'z'>=ch){
                ch = (char) (ch-32);
                System.out.print(ch + " ");
            }
            else {
                System.out.print(ch + " ");
            }
        }

//        System.out.println();
//        Day07 obj = new Day07();
//        obj.hashsettry();
    }


}