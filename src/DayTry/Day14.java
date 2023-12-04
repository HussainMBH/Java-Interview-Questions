package DayTry;

import java.util.Arrays;

public class Day14 {
    public static void main(String[] args) {
        Day14 objday = new Day14();
        objday.selectionsorting();
        objday.bubblesorting();
        objday.binarysearch();
    }
    void selectionsorting(){
        int a[] = {5,9,7,3,1,10,4,8,2,6};
        int l = a.length;
        for(int i=0; i<l-1; i++){
            int min = i;
            for(int j=i; j<l; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }

        System.out.println(Arrays.toString(a));
    }

    void bubblesorting(){
        int a[] = {5,9,7,3,1,10,4,8,2,6};
        int l = a.length;
        for (int i=l-1; i>0; i--){
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

    void binarysearch(){
        int a[] = {10,20,30,40,50,60,70,80,90};
        int key = 100;
        int lb = 0;
        int ub = a.length-1;
        int flag = 0;
        while (lb<=ub){
            int mid = (lb+ub)/2;
            if(a[mid] == key){
                System.out.println("Found at " + mid);
                flag = 1;
                break;
            } else if (mid < key) {
                lb = mid +1;

            } else if (mid > key) {
                ub = mid -1;
            }
        }
        if(flag == 0){
            System.out.println("element not found");
        }

    }
}
