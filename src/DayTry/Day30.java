package DayTry;

import java.util.ArrayList;
import java.util.Arrays;

public class Day30 {
    public static void main(String[] args) {
        removeduplicate();
    }

    static void findduplicate(){
        int a[] = {5,7,6,4,3,9,8,1,6,4,7,8,10,2,5,7,3,1,10,5,8,9};
        System.out.println(Arrays.toString(a));
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){

            }
        }
    }

    static void removeduplicate(){
        int a[] = {5,7,6,4,3,9,8,1,6,4,7,8,10,2,5,7,3,1,10,5,8,9};
        System.out.println(Arrays.toString(a));
       int flag = -1;
       for(int i=0; i<a.length; i++){
           if(a[i] != -1){
               for(int j=i+1; j<a.length; j++){
                   if(a[i] == a[j]){
                       a[j] = flag;
                   }
               }
               System.out.print(a[i] + " ");
           }
       }
    }
}
