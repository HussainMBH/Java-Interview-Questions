package DayTry;

import java.util.Arrays;

public class Day15 {
    public static void main(String[] args) {
        Day15 obj = new Day15();
        obj.binarysearch();
        obj.selectionsort();
        obj.bublesorting();
    }

    void bublesorting(){
        int a[] = {8,5,7,9,3,6,1,4,10,2};
        for(int i=a.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(a[j+1] <a[j]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    void selectionsort(){
        int a[] = {8,5,7,9,3,6,1,4,10,2};
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

    void binarysearch(){
        int a[] = {1,2,3,4,5,6,7,8,9};
        int key = 8;
        int lb = 0;
        int ub = a.length-1;
        int flag = 0;
        while (lb<=ub){
            int mid = (lb + ub)/2;
            if(key == mid){
                System.out.println("Your element found at " + mid);
                flag = 1;
                break;
            } else if (mid < key) {
                lb = mid + 1;
            } else if (key < mid) {
                ub = mid - 1;
            }
        }
        if(flag == 0){
            System.out.println("Your element not found");
        }
    }
}
