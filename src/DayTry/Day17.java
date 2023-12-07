package DayTry;

import java.util.Arrays;

public class Day17 {
    public static void main(String[] args) {
        Day17 obj = new Day17();
        obj.sortingarray();
    }

    void sortingarray(){
        int a[] = {8,9,7,6,4,5,3,1,2,10};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
