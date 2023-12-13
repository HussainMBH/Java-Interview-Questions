package DayTry;

import java.util.ArrayList;
import java.util.Arrays;

public class Day21 {
    public static void main(String[] args) {
        Day21 obj = new Day21();
        obj.sorting();
        obj.bubblesorting();
        obj.movezero();
    }

    void movezero(){
        int a[] = {5,8,0,4,0,9,10,0,0,1,3,0,6,0,2,0};
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                al.add(a[i]);
            }
        }

        int tm = al.size();
        for(int i=tm; i<a.length; i++){
            a[i] = 0;
        }
        for( int i=0; i<tm; i++){
            a[i] = al.get(i);
        }


        System.out.println(Arrays.toString(a));
    }

    void bubblesorting(){
        int a[] = {8,6,7,9,2,10,5,3,1,4};
        for(int i=a.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(a[j]> a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    void sorting(){
        int a[] = {8,6,7,9,2,10,5,3,1,4};
        for(int i=0; i<a.length; i++){
            int min = i;
            for(int j=i; j<a.length; j++){
                if(a[j] <a[min]){
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
