import java.util.Scanner;

public class leetcode {
    public static void main(String[] args){

        leetcode obj = new leetcode();
        arrayquestions arqstn = new arrayquestions();
        arqstn.arrayques();



        int target = 9;
        int trgt = 10;
        Scanner inpobj = new Scanner(System.in);
        int n;
        int nn;
        int arr[] = new int[5];
        int ar[] = new int[5];
        System.out.println("Enter number:");
        n = inpobj.nextInt();

        System.out.println("Enter each numbers: ");
        for(int i=0; i<n; i++){
            arr[i] = inpobj.nextInt();
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] +" ");
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

        System.out.println("////////////");
        System.out.println("Enter count number: ");
        nn = inpobj.nextInt();

        System.out.print("Enter numbers: ");
        for(int i=0; i<nn; i++){
            ar[i] = inpobj.nextInt();
        }
        for(int i =0; i<nn; i++){
            System.out.println(ar[i]);
        }

        System.out.println();
        for(int i =0; i<nn; i++){
            for(int j=0; j<nn; j++){
                if(ar[i] + ar[j]==trgt){
                    System.out.println(ar[i] +" " + ar[j]);
                }
            }
        }


    }
}
