package DayTry;

import java.util.Arrays;

public class Day33 {
    public static void main(String[] args) {
        checkarray();
    }

    static void checkarray(){
        int a[] = {1,2,3};
        int ab[] = {5,8,3,4,9,3,10,7,2,6,1};
        Arrays.sort(ab);
        System.out.println(ab);
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
