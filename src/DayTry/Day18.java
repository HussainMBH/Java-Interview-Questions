package DayTry;

public class Day18 {
    public static void main(String[] args) {
        Day18 obj = new Day18();
        obj.checkdword();
    }

    void checkdword(){
        String a = "Mohamed Bahir Hussain";
        String b= "Bahir";
        int count =0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == b.charAt(0)){
                for(int j=0; j<b.length(); j++){
                    if(a.charAt(i) == b.charAt(j)){
                        count++;
                        i++;

                    }
                }
                if(count == b.length()){
                    System.out.println("word found at here");
                }
                else {
                    System.out.println("word not found at here");
                }
            }
        }
    }
}
