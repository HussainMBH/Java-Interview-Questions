package DayTry;

import java.util.ArrayList;
import java.util.HashSet;

public class Day10 {
    public static void main(String[] args){
        Day10 objday10 = new Day10();
        objday10.findduplicate();
        objday10.removeduplicate();
        objday10.striptrailing();
    }

    void striptrailing(){
        String s = "Mohamed Bahir Hussain           ";
        int l = s.length();
        System.out.println(l);
        s = s.stripTrailing();
        System.out.println(s);
        System.out.println(s.length());
        int end = 0;
        int count = 0;
        for(int i=s.length()-1; i>=0; i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            else {
                end = i;
                break;
            }
        }
        for(int i=0; i<=end; i++){
            System.out.print(s.charAt(i));
            count++;
        }
        System.out.println();
        System.out.println(count);
    }
    void removeduplicate(){
        int a[] = {9,5,4,7,10,3,4,6,2,5,7,1,8};
        int l = a.length;
        HashSet<Integer> remo = new HashSet<>();
        for(int i=0; i<l; i++){
            boolean isduplicate = false;
            for(int j=i+1; j<l; j++){
                if(a[i] == a[j]){
                    isduplicate = true;
                    break;
                }
            }
            if(isduplicate == false){
                remo.add(a[i]);
            }
        }
        System.out.println(remo);
    }

    void findduplicate(){
        int a[] = {9,5,4,7,8,10,3,4,6,2,5,7,1,8};
        int l = a.length;
        ArrayList<Integer> dup = new ArrayList<>();
        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                if(a[i] == a[j]){
                    dup.add(a[i]);
                }
            }
        }
        System.out.println(dup);
    }
}
