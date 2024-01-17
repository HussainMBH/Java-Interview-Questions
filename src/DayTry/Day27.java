package DayTry;

import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        findlargest();
        findsmallest();
        findoddoreven();
    }

    static void findoddoreven(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = scn.nextInt();
        if(a%2==0 && a!= 0){
            System.out.println("Number " + a + " is a even number.");
        }
        else if(a%2 !=0){
            System.out.println("Number " + a + " is a odd number.");
        }
        else {
            System.out.println("Invalid");
        }
    }

    static void findsmallest(){
        int a[] = {5,9,7,3,6,-10,4,10,1,2,4,15,6,3};
        int b= a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<b && a[i]>= 0){
                b=a[i];
            }
        }
        System.out.println("Smallest Element: " + b);
    }

    static void findlargest(){
        int a[] = {5,9,7,3,6,4,10,1,2,4,15,6,3};
        int b= a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>b){
                b = a[i];
            }
        }
        System.out.println("Largest Element: " + b);
    }
}
