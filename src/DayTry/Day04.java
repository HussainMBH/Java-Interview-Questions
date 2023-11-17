package DayTry;

import java.util.ArrayList;
import java.util.Arrays;

public class Day04 {
    public static void main(String[] args){
        Day04 objday4 = new Day04();
        objday4.findduplicate();
        System.out.println();
        objday4.adduniquenumber();

    }

    public void findduplicate(){
        int a[] = {3,6,5,3,1,5,4,6,6};
        int l = a.length;
        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                if(a[i] == a[j]){
                    System.out.print(a[j] + " ");
                }
            }
        }

    }
    public void adduniquenumber(){
        int a[] = {2,6,7,6,4,2,9,1,5,4,6,8};
        int l = a.length;
        int n=-1;
        int lrg = a[0];
        for(int i=0; i<l; i++){
            if(a[i]>lrg){
                    lrg = a[i];
            }
        }
        System.out.println(lrg);

        for(int i=0; i<l; i++){
            int min = i;
            for(int j=i; j<l; j++){
                if(a[j]<a[min]){
                    min = a[j];
                }
            }
            int tmp = min;
            min = a[i];
            a[i] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
