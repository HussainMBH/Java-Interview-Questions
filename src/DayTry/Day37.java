package DayTry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day37 {
    public static void main(String[] args) {

        int a[] = {5,8,3,1,6,9,4,2,10,7};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 != 0){
                al.add(a[i]);
                a[i] = 0;
            }
        }
        Collections.sort(al);
        System.out.println(al);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int x=0;
        for(int i= al.size() -1; i>=0; i--){
            a[x] = al.get(i);
            x++;
        }
        System.out.println(Arrays.toString(a));
    }
}
