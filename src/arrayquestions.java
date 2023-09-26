import java.util.Scanner;

public class arrayquestions {
    private String arrayquestion(){
        int n = 10;
        String name = "Bahir";
        System.out.println(name);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number");
        int c = scn.nextInt();

        System.out.println(c);
        return name;

    }



    public static void main(String[] args){
        arrayquestions objarq = new arrayquestions();
        objarq.arrayquestion();

    }

    public void arrayques(){
        System.out.println("Hello buddy.");
    }
}
