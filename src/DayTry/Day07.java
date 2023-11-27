package DayTry;

import java.util.HashSet;

public class Day07 {
    public static void main(String[] args){
        String s = "dbsjhvsd(*$^%$%^34gvhhb";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>= 'a' && 'z'>=ch){
                ch = (char) (ch-32);
                System.out.print(ch + " ");
            }
            else {
                System.out.print(ch + " ");
            }
        }

            System.out.println();
            Day07 obj = new Day07();
            obj.hashsettry();
    }

    void hashsettry(){
        int a[] = {1,2,2,3,3,3,4,5,6,4,2,1,8,9,7,10,9};
        HashSet<Integer> nwhst = new HashSet<>();
        for(int i=0; i<a.length; i++){
            nwhst.add(a[i]);
        }
        System.out.println(nwhst);
        HashSet<Integer> hst = new HashSet<>();
        hst.add(10);
        hst.add(10);
        hst.add(11);
        hst.add(15);
        System.out.println(hst);
    }
}