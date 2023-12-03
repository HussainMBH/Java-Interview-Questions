package DayTry;

public class Day {

    public static void main(String[] args) {
       Day obj = new Day();
       obj.reversesentence();
        System.out.println();
       obj.changetouppercase();
        System.out.println();
       obj.changetolowercase();
    }

    void changetolowercase(){
        String s = "MOHAMED BAHIR HUSSAIN";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch<= 'Z'){
                ch = (char) (ch + 32);
                System.out.print(ch);
            }
            else {
                System.out.print(ch);
            }
        }
    }

    void changetouppercase(){
        String s = "Mohamed Bahir Hussain";
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>= 'a' && 'z'>=ch){
                ch = (char) (ch - 32);
                System.out.print(ch);
            }
            else {
                System.out.print(ch);
            }
        }
    }

    void reversesentence(){
        String s = "Mohamed Bahir Hussain";
        int starting = 0;
        int ending = s.length() - 1;
        for(int i=s.length() - 1; i>=0; i--){
            if(s.charAt(i) != ' '){
                continue;
            }
            else {
                starting = i+1;
                reverse(s, starting, ending);
                ending = i - 1;
            }
        }
    }

    private static void reverse(String s, int starting, int ending) {
        String a = "";
        for (int i = starting; i <= ending; i++) {
            a = a + s.charAt(i);
        }
        System.out.print(a + " ");
    }
}
