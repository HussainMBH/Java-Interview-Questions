package DayTry;

public class Day36 {
    public static void main(String[] args) {
        linearsearch();
    }

    static void linearsearch(){
        int key = 6;
        int a [] = {4,7,3,5,6,9,1,3,2};
        for(int i=0; i<a.length; i++){
            if(a[i] == key){
                System.out.println("Element " + key + " found at " + i + "th place.");
            }
        }
    }
}
