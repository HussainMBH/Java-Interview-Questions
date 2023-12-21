package DayTry;

public class Day24 {
    public static void main(String[] args) {
        Day24 obj = new Day24();
        obj.linearsearch();
    }

    void linearsearch(){
        int a[] = {8,4,7,2,3,10,85,98,74,35,12,91,42};
        int key = 35;
        int flag = 0;
        for(int i=0; i<a.length; i++){
            if(key == a[i]){
                System.out.println("Your item "+ key+ " found at "+i);
                flag  = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Your item "+ key+ " not found at here.");
        }
    }
}
