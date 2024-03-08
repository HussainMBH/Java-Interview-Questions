package DayTry;

public class Day34 {
    public static void main(String[] args) {
        findmaximum();
        maxmin();
    }

    static void maxmin(){
        int a[] = {2,8,10,6,15,2,7,25};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i] <min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println(min + " " + max);
    }

    static void findmaximum(){
        int a[] = {2,8,10,6,15,2,7,25};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]> max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
