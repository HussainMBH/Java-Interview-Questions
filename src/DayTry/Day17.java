package DayTry;

import java.util.Arrays;

public class Day17 {
    public static void main(String[] args) {
        Day17 obj = new Day17();
        obj.sortingarray();
        obj.findlargest3element();
        System.out.println();
        obj.moveallzerotoend();
        obj.checkwords();
    }

    void checkwords(){
        String a = "Mohamed Bahir Hussain";
        String b = "Bahir";
        int count = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == b.charAt(0)){
                for(int j=0; j<b.length(); j++){
                    if(b.charAt(j) == a.charAt(i)){
                        count++;
                       i++;
                    }
                }
                if(count == b.length()){
                    System.out.println("Yah element found");
                }
                else {
                    System.out.println("element not found");
                }
            }
        }
    }

    void moveallzerotoend(){
        int a[] = {1,0,8,0,4,0,6,0,0,7,3,0,4,0,3,5};
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                a[count] = a[i];
                count++;
            }
        }
        while (count<a.length){
            a[count] = 0;
            count++;
        }
        System.out.println(Arrays.toString(a));
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
