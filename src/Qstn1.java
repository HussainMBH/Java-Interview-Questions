import java.util.Scanner;

public class Qstn1 {

    public static void main(String[] args){
        Qstn1 qstnobj = new Qstn1();
        qstnobj.stringvalue();
        qstnobj.integervalue();
        qstnobj.Stringcount();

    }

    public void stringvalue(){
        //String value reverse
        String name = "Bahir";
        StringBuffer buf = new StringBuffer();
        buf.append(name);

        System.out.println(buf.reverse());
    }

    public void integervalue(){
        int num = 5421648;
        int rev = 0; //initialize
        int inrev;
        while(num!=0){ // upto num = 0
            inrev = num % 10; // in here divided reminder will come and save
            num = num / 10; // again divided by 10
            rev = (rev*10) + inrev;
        }
        System.out.println(rev);
    }
    public static int x;

    public void Stringcount(){
        String name = "Bahir Hussain";
        int count = 0;
        for(int i = 0; i<name.length(); i++){
            if(name.charAt(i) != 'a'){
                count++; //With space count letters only correctly
            }
            //count++; //without space it's enough
        }
        System.out.println(count);

    }

}
