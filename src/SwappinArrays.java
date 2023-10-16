import java.util.Arrays;

public class SwappinArrays {
    public static void main(String[] args){
        int arr[] = {4,3,8,6,5,1};
        int n = arr.length;
        for(int i =0; i<=n-2; i++){ // swapping loop that's why use up to n-2
            int min = i; //minimum value initialized
            for(int j = i; j<=n-1; j++){ // finding minimum value that's why use up to n-1
                if(arr[j] < arr[min]){
                    min = j;
                }
                //swap sorting
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }

        for (int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
