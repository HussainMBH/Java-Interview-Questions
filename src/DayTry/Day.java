package DayTry;

public class Day {

    public static void main(String[] args) {
       Day obj = new Day();
       obj.reversesentence();
    }

    void reversesentence(){
        String s = "Mohamed Bahir Hussain";
        int starting = 0;
        int ending = s.length() - 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                continue;
            } else {
                starting = i + 1;
                reverse(s, starting, ending);
                ending = i - 1;
            }
        }
        reverse(s, 0, ending);
    }

    private static void reverse(String s, int starting, int ending) {
        String a = "";
        for (int i = starting; i <= ending; i++) {
            a = a + s.charAt(i);
        }
        System.out.print(a + " ");
    }
}
