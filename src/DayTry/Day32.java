package DayTry;

import java.util.ArrayList;
import java.util.Objects;

public class Day32 {
    public static void main(String[] args) {
        howmany();

    }

    static void howmany(){
        int a = 6;
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> bl = new ArrayList<>();
        for(int i=1; i<=a; i++){
            if(a%i == 0){
                al.add(i);
                System.out.print(i + " ");
            }
        }
        System.out.println(al);

        int b = 3;
        for(int i=1; i<=b; i++){
            if(b%i == 0){
                bl.add(i);
                System.out.print(i + " ");
            }
        }
        System.out.println(bl);

        for (int i=0; i<al.size(); i++){
            if(Objects.equals(al.get(i), bl.get(i))){
                System.out.println(al);
            }
        }
    }
}
