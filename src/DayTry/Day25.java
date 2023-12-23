package DayTry;

public class Day25 {
    public static void main(String[] args) {
        Day25 obj = new Day25();
        obj.removebackspace();
    }

    void removebackspace(){
        String a = "Mohamed Bahir Hussain      ";
        System.out.println(a);
        int end = 0;
        for(int i=a.length()-1; i>=0; i--){
            char ch = a.charAt(i);
            if(ch == ' '){
                continue;
            }
            else {
                end = i;
                break;
            }
        }
        for(int i=0; i<=end; i++){
            char ch = a.charAt(i);
            System.out.print(ch);
        }
    }
}
