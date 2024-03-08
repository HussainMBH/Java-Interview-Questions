package DayTry;

public class Day35 {
    public static void main(String[] args) {
        findevenodd();
        findlastdigit();
    }

    static void findevenodd(){
        int a[] = {5,9,2,7,6,4,1,8,3};
        for(int i=0; i<a.length; i++){
            if(a[i]%2 == 0){
                System.out.println("Number " + a[i] + " is Even Number");
            }
            else {
                System.out.println("Number " + a[i] + " is Odd Number");
            }
        }
    }
    static void findlastdigit(){
        int a = 643548651;
        System.out.println(a%10);
    }
}
