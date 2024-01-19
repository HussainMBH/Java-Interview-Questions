package DayTry;

import java.util.Arrays;

public class Day28 {
    public static void main(String[] args) {
        reversesort();
        sortedarray();
        bubblesort();
        int i = countdigit(123450);
        System.out.println(i);
    }

    static void reversesort(){
        int a[] = {3,9,7,5,1,2,4,6,7,2,9,3,10};
        for(int i=0; i<a.length; i++){
            int max = i;
            for (int j=i; j<a.length; j++){
                if(a[j] > a[max]){
                    max = j;
                }
            }
            int tmp = a[max];
            a[max] = a[i];
            a[i] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }

    static void bubblesort(){
        int a[] = {3,9,7,5,1,2,4,6,7,2,9,3,10};
        for(int i=a.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static void sortedarray(){
        int a[] = {3,9,7,5,1,2,4,6,7,2,9,3,10};
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

    static int countdigit(int a){
        int count = 0;
        while(a>0){
            int b = a%10;
            count++;
            a = a/10;
        }
        return count;
    }
}
