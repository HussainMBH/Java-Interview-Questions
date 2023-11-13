package DayTry;

import java.util.Arrays;

public class Day02 {
    public static void main(String[] args){
        int a[] = {1,2,3,5,6,7};
        int l = a.length;
        //find missing number
        for(int i=1; i<l; i++){
            int flag = 0;
            for(int j=0; j<l; j++){
                if(a[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Find Missing Number: " + i);
            }
        }

        int ar[] = {8,5,9,10,7,6,3,1,2,4};
        int ll = ar.length;
        for(int k=0; k<ll-1; k++){
            int min = k;
            for(int j=k; j<ll; j++){
                if(ar[j]<ar[min]){
                    min = j;
                }
            }
            int tmp = ar[min];
            ar[min] = ar[k];
            ar[k] = tmp;
        }
        System.out.println("Sorted Array: "+Arrays.toString(ar));


        int b[] = {0,1,1,2,3,3,3,5,4};
        int cnt = 0;
        int maxim = 0;
        for(int i=0; i<b.length; i++){
            if(b[i] == 3){
                cnt++;
            }
            maxim = Math.max(maxim, cnt);
        }
        System.out.println(maxim);


        int c[] = {10,7,9,8,3,5,1,2,4,6};
        int cc = c.length;
        for(int i=cc-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(c[j]>c[j+1]){
                    int tmp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
