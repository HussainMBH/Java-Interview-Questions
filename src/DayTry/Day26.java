package DayTry;

import java.util.Arrays;

public class Day26 {
    public static void main(String[] args) {
        sorting();
        bubblesort();
        findduplicateltr();
    }

    static void findduplicateltr(){
        String s = "abanskbkbkdsb";
        int flag = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            for(int j=i+1; j<s.length(); j++){
                if(ch == s.charAt(j)){
                    System.out.println("element matched " + s.charAt(j));
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("element missing");
        }
    }

    static void movezero(){
        int a[] = {0,5,7,9,0,6,4,3,0,3,4,0,3,4,0};
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                count++;
            }
        }
        for(int i=0; i<count; i++){

        }
    }


    static void bubblesort(){
        int a[] = {5,7,9,3,4,2,1,6,10,8};
        for(int i=a.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static void sorting(){
        int a[] = {5,7,9,3,4,2,1,6,10,8};
        for(int i=0; i<a.length; i++){
            int min = i;
            for(int j=i; j<a.length; j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
