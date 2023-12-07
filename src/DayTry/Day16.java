package DayTry;

import java.util.ArrayList;
import java.util.Arrays;

public class Day16 {
    public static void main(String[] args) {
        Day16 obj = new Day16();
        obj.binarysearch();
        obj.removebackspace();
        obj.removezero();
        System.out.println();
        obj.movezerotolast();

    }

    void movezerotolast(){
        int a[] = {1,5,0,5,0,8,9,0,7,3,0,6,1,0,3,0};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                al.add(a[i]);
            }
        }
        System.out.println(al);
    }

    void removezero(){
        int a[] = {1,5,0,5,0,8,9,0,7,3,0,6,1,0,3,0};
        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                System.out.print(a[i] + " ");
            }
        }
    }

    void removebackspace(){
        String a = "Mohamed Bahir Hussain         ";
        System.out.println(a.length());
        int end = 0;
        int count = 0;
        for(int i = a.length() - 1; i>=0; i--){
            char ch = a.charAt(i);
            if(ch == ' '){
                continue;
            }
            else {
                end = i;
                break;
            }
        }
        for(int i=0; i<= end; i++){
            System.out.print(a.charAt(i));
            count++;
        }
        System.out.println();
        System.out.println(count);
    }
    void binarysearch(){
        int a[] = {1,9,4,6,8,7,3,5,2,3};
        char key = 2;
        int lb = 0;
        int ub = a.length -1;
        while(lb<=ub){
            int mid = (lb + ub)/2;
            if(mid == key){
                System.out.println("Your element found " + mid);
                break;
            }

            if(mid <key){
                lb = mid +1;
            } else if (mid > key) {
                ub = mid -1;

            }
        }
    }
}
