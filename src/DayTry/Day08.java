package DayTry;

import java.util.ArrayList;
import java.util.Arrays;

public class Day08 {
    public static void main(String[] args){
        Day08 objday8 = new Day08();
        objday8.selectionsorting();
        objday8.bublesorting();

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

    void bublesorting(){
        int a[] = {9,5,6,7,3,1,4,2,10,8};
        int l = a.length;
        for(int i = l-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
