package DayTry;

import java.util.Arrays;

public class Day17 {
    public static void main(String[] args) {
        Day17 obj = new Day17();
        obj.sortingarray();
        obj.findlargest3element();
    }

    void findlargest3element(){
        int a[] = {8,9,7,6,4,5,3,1,2,10};
        System.out.println("First method");
        Arrays.sort(a);
        for(int i= a.length-1; i> a.length-4; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Second method");
        System.out.print(a[a.length-1] + " ");
        System.out.print(a[a.length-2] + " ");
        System.out.print(a[a.length-3]);
    }

    void sortingarray(){
        int a[] = {8,9,7,6,4,5,3,1,2,10};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
