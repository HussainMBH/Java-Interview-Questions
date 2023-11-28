package DayTry;

import java.util.Arrays;
import java.util.Scanner;

public class Day09 {
    public static void main(String[] args){
        Day09 objday9 = new Day09();
        objday9.substring();
        objday9.striptrailing();
    }

    void striptrailing(){
        String a = "Hardwork never fails         ";
        System.out.println(a + " - " + a.length());
        a = a.stripTrailing();
        System.out.println("Default Striptrailing: "+a);
        int end = 0;
        int count = 0;
        for(int i=a.length()-1; i>=0; i++){
            if(a.charAt(i) == ' '){
                continue;
            }
            else {
                end = i;
                break;
            }
        }
        for(int i=0; i<end; i++){
            System.out.print(a.charAt(i));
            count++;
        }
        System.out.println();
        System.out.println(count);

    }

    void substring(){
        String a = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("FInd SubString: ");
        a = a.substring(5, 16);
        System.out.println(a);
        String aa = "abcdefghijklmnopqrstuvwxyz";
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your starting and ending point");
        int starting = scn.nextInt();
        int ending = scn.nextInt();

        for(int i=starting; i<ending; i++){
            System.out.print(aa.charAt(i));
            char ch = aa.charAt(i);
            ch = (char)(ch-32);
            System.out.println(ch);
        }

        aa = aa.replace("n", "M");
        System.out.println(aa);
    }
}
