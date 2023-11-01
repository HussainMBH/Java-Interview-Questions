package DayTry;

import java.util.Arrays;

public class Day01 {
    int ar[] = {8,5,6,4,9,2,3,1,10,7};
    int l = ar.length;
    public static void main (String[] args){
        System.out.println("Day 01");
        Day01 objday01 = new Day01();
        objday01.Sortedarray();
        System.out.print(Arrays.toString(objday01.ar) + " ");
        System.out.println();
        objday01.Bubblesorted();
        System.out.print(Arrays.toString(objday01.ar) + " ");


    }
    public void Sortedarray(){
        System.out.println("Selection Sorted Array");
        for(int i=0; i<l-1; i++){
            int min = i;
            for (int j=i; j<l; j++){
                if(ar[j]<ar[min]){
                    min = j;
                }
            }
            int tmp = ar[min];
            ar[min] = ar[i];
            ar[i] = tmp;
        }
    }
    public void Bubblesorted(){
        for(int i=l-1; i>0; i--){
            for (int j=0; j<i-1; j++){
                if(ar[j]>ar[j+1]){
                    int tmp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = tmp;
                }
            }
        }
    }
}
