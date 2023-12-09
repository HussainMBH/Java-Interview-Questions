package DayTry;

import java.util.Arrays;

public class Day19second {
    public static void main(String[] args) {
        Day19second obj = new Day19second();
        obj.binarysearch();
    }

    void binarysearch(){
        int a[] = {15, 24, 10, 6, 80, 43, 36, 57, 38, 21};
        Arrays.sort(a);
        int key = 38;
        int lb = 0;
        int ub = a.length-1;
        int flag = 0;
        while (lb<=ub){
            int mid = (lb + ub)/2;
            if(a[mid] == key){
                System.out.println("Your element " + a[mid] + " is found at " + mid);
                flag = 1;
                break;
            } else if (a[mid] < key) {
                lb = mid + 1;
            }
            else {
                ub = mid -1;
            }
        }
        if(flag == 0){
            System.out.println("Your element " + key + " is not found at here");
        }
    }
}
