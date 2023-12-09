package DayTry;

import java.util.Arrays;

public class Day18 {
    public static void main(String[] args) {
        Day18 obj = new Day18();
        obj.checkdword();
        obj.selectionsort();
    }

    void selectionsort(){
        int a[] = {10,5,4,7,8,3,9,2,1,6};
        for(int i=0; i<a.length; i++){
            int min = i;
            for(int j=i+1; j<a.length; j++){
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

    void checkdword(){
        String a = "Mohamed Bahir Hussain";
        String b= "Bahir";
        int count =0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == b.charAt(0)){
                for(int j=0; j<b.length(); j++){
                    if(a.charAt(i) == b.charAt(j)){
                        count++;
                        i++;

                    }
                }
                if(count == b.length()){
                    System.out.println("word found at here");
                }
                else {
                    System.out.println("word not found at here");
                }
            }
        }
    }
}
