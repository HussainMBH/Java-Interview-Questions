package DayTry;

import java.util.Arrays;

public class Day22 {
    public static void main(String[] args) {
        Day22 obj = new Day22();
        obj.binarysearch();
    }


    void binarysearch(){
        int a[] = {8,3,4,5,7,9,1,2,6,10};
        Arrays.sort(a);
        int flag = 0;
        int key = 8;
        int lb = 0;
        int ub = a.length-1;
        while (lb<ub){
            int mid = (lb+ub)/2;
            if(a[mid] == key){
                flag = 1;
                System.out.println("your element " + a[mid]+ " found at " + mid);
                break;
            }
            else if(mid> key){
                ub = mid -1;
            }
            else {
                lb = mid +1;
            }
        }

        if(flag == 0){
            System.out.println("Your element " + key+ " not found at here");
        }
    }
}
