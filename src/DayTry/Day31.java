package DayTry;

import java.util.Arrays;

public class Day31 {
    public static void main(String[] args) {
        removeduplicate();
        System.out.println();
        findduplicate();
        reverseinteger();
    }

    static void reverseinteger(){
        int a = 123456;
        int rev = 0;
        while (a > 0){
            int tmp = a%10;
            rev = rev*10 + tmp;
            a = a/10;
        }
        System.out.println(rev);
    }

    static void findduplicate(){
        int a[] = {5,7,6,4,3,9,8,1,4};
        System.out.println(Arrays.toString(a));
        int flag = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    System.out.println("Element " + a[i] + " has duplicate element in this array");
                    flag = 1;
                }
            }
        }
        if(flag == 0){
            System.out.println("no duplicate found here");
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
