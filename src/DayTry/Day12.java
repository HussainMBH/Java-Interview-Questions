package DayTry;

import java.util.Arrays;
import java.util.HashSet;

public class Day12 {
    public static void main(String[] args) {
        Day12 objday12 = new Day12();
        objday12.linearsearching();
        objday12.bubblesorting();
        objday12.removeduplicate();
    }

    void removeduplicate(){
        int a[] = {8,3,7,9,10,5,8,6,2,2,1,4,11,11};
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<=a.length-1; i++){
            for (int j=1; j<a.length; j++){
                if(a[i] != a[j]){
                    hs.add(a[i]);
                }
            }
        }
        System.out.println(hs);
    }

    void bubblesorting(){
        int a[] = {8,3,7,9,10,5,6,2,1,4};
        for (int i=a.length - 1; i>=0; i--){
            for (int j=0; j<=i-1; j++){
                if(a[j] >a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    void linearsearching(){
        String a = "Mohamed Bahir Hussain";
        char key = 'z';
        int flag = 0;
        for (int i=0; i<a.length(); i++){
            if(a.charAt(i) == key){
                System.out.println("Your Element is find here");
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Your element is not find here");
        }
    }
}
