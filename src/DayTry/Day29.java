package DayTry;

public class Day29 {
    public static void main(String[] args) {
        reverseint();
        revarraystring();
    }

    static void revarraystring(){
        String s[] = {"h","e","l","l","o"};
        for(int i = s.length-1; i>=0; i--){
            String ch = s[i];
            System.out.print('"'+ch+'"'+',');
        }
    }

    static void reverseint(){
        int a = 2345;
        int revese = 0;
        while (a>0){
            int lastdigit = a%10;
            revese = revese*10 + lastdigit;
            a = a/10;
        }
        System.out.println(revese);
    }
}
