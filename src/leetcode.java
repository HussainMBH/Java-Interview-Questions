import java.util.Scanner;

public class leetcode {
    public static void main(String [] args){

        int target = 9;
        Scanner inpobj = new Scanner(System.in);
        int n;
        int arr[] = new int[5];
        System.out.println("Enter number:");
        n = inpobj.nextInt();

        System.out.println("Enter each numbers: ");
        for(int i=0; i<n; i++){
            arr[i] = inpobj.nextInt();
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Find Array index of totals 9");

        for(int i=0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] +" "+ arr[j]);
                }
            }
        }


    }
}
