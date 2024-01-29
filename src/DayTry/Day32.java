package DayTry;

import java.util.ArrayList;

public class Day32 {
    public static void main(String[] args) {
        howmany();
    }

    static void howmany(){
        int a = 30;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1; i<=a; i++){
            if(a%i == 0){
                al.add(i);
            }
        }
        System.out.println(al);
    }
}
