import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello\nBahir Hussain");

        int a=50;
        int b=60;
        int c=a+b;
        System.out.println(c);

        //getting number from users
        Scanner addnum = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a1 = addnum.nextInt();

        System.out.println("Enter Second Number: ");
        int a2 = addnum.nextInt();
        int a3=a1+a2;
        System.out.println("It's added Question");
        System.out.println("Total Number is " + a3);

        System.out.println("It's Divided Question");
        int a4=a3/2;
        System.out.println("Answer is " + a4);

        System.out.println("It's multiplied Question");
        int a5=a3*a4;
        System.out.println("Answer is "+ a5);

    }
}