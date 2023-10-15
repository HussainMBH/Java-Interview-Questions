/*
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.
*/

public class PowerofFour {
    public static void main(String [] args){
        int num = 16;
        int n = 2^30;
        if(n<0){
            System.out.println("Number Below 0 so False");
        } else if (n == 1) {
            System.out.println("True because 1 is firs number of 4");
        } else if (num % n == 4 || num % n == 6) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
