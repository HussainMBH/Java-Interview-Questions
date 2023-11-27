package DayTry;

import java.util.ArrayList;
import java.util.Arrays;

public class Day08 {
    public static void main(String[] args){
        Day08 objday8 = new Day08();
        objday8.selectionsorting();

    }

    void selectionsorting(){
        int a[] = {9,5,6,7,3,1,4,2,10,8};
        int l = a.length;
        for(int i=0; i<l; i++){
            int min = i;
            for(int j=i; j<l; j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            int tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
