package DayTry;

import java.util.Scanner;

public class Day09 {
    public static void main(String[] args){
        Day09 objday9 = new Day09();
        objday9.substring();
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

            char ch = aa.charAt(i);
            ch = (char)(ch-32);
            System.out.print(ch);
        }
    }
}
