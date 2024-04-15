package DayTry;

public class Day36 {
    public static void main(String[] args) {
        linearsearch();
    }

    


    static void linearsearch(){
        int key = 16;
        int a [] = {4,7,3,5,6,9,1,3,2};
        int flag = 0;
        for(int i=0; i<a.length; i++){
            if(flag == 0) {
                if (a[i] == key) {
                    System.out.println("Element " + key + " found at " + i + "th place.");
                    flag = 1;
                }
            }
        }
        if(flag == 0){
            System.out.println("Element " + key + " not found at here");
        }
    }
}
