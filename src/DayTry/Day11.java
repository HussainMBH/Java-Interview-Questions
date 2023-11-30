package DayTry;

public class Day11 {
    public static void main(String[] args) {
        String a1 = "Hello Guys, I'm Mohamed Bahir Hussain";
        int start = 0, end = a1.length()-1;
        for(int i=a1.length()-1; i>=0; i--){
            if(a1.charAt(i) != ' '){
                continue;
            }
            else {
                start = i + 1;
                reverse(a1, start, end);
                end = i-1;
            }
        }
        reverse(a1, 0, end);
    }

    private static void reverse(String a1, int start, int end){
        String a2 = "";
        for(int i=start; i<=end;i++){
            a2 = a2 + a1.charAt(i);
        }
        System.out.print(a2 + " ");
    }
}
