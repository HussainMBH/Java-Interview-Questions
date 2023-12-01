package DayTry;

public class Day12 {
    public static void main(String[] args) {
        Day12 objday12 = new Day12();
        objday12.linearsearching();
    }

    void linearsearching(){
        String a = "Mohamed Bahir Hussain";
        char key = 'z';
        int flag = 0;
        for (int i=0; i<a.length(); i++){
            if(a.charAt(i) == key){
                System.out.println("Your Element is find here");
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Your element is not find here");
        }
    }
}
