package DayTry;

import java.util.Arrays;

public class Day33 {
    public static void main(String[] args) {
        removeduplicate();
        System.out.println();
        checkarray();
    }

    static void removeduplicate(){
        int a[] = {3,5,7,1,6,5};
        int flag = -1;
        for (int i=0; i<a.length-1; i++){
            if(flag != a[i]){
                for(int j=i+1; j<a.length; j++){
                    if(a[i] == a[j]){
                        a[j] = flag;
                    }
                }
                System.out.print(a[i] + " ");
            }
        }
    }

    static void checkarray(){
        int ab[] = {1,2,3};
        int a[] = {5,8,3,4,9,3,10,7,2,6};
        Arrays.sort(ab);
        System.out.println(Arrays.toString(ab));
        int flag = 0;
        for(int i=0; i<a.length-1; i++){
            if(a[i]<a[i+1]){
                continue;
            }
            else {
                flag=1;
            }
        }
        if(flag == 0){
            System.out.println("It's sorted array");
        }
        else {
            System.out.println("It's not sorted array");
        }
    }
}
