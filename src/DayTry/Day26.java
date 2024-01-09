package DayTry;

import java.util.Arrays;

public class Day26 {
    public static void main(String[] args) {
        sorting();
        bubblesort();
    }

    static void bubblesort(){
        int a[] = {5,7,9,3,4,2,1,6,10,8};
        for(int i=a.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static void sorting(){
        int a[] = {5,7,9,3,4,2,1,6,10,8};
        for(int i=0; i<a.length; i++){
            int min = i;
            for(int j=i; j<a.length; j++){
                if(a[j]<a[min]){
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
