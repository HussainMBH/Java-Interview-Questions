package DayTry;

import java.util.ArrayList;

public class Day10 {
    public static void main(String[] args){
        Day10 objday10 = new Day10();
        objday10.findduplicate();
    }

    void findduplicate(){
        int a[] = {9,5,4,7,10,3,4,6,2,5,7,1,8};
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
