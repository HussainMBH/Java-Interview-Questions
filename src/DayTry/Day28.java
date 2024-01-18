package DayTry;

public class Day28 {
    public static void main(String[] args) {
        int i = countdigit(123450);
        System.out.println(i);
    }

    static int countdigit(int a){
        int count = 0;
        while(a>0){
            int b = a%10;
            count++;
            a = a/10;
        }
        return count;
    }
}
