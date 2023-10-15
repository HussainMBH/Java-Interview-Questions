import java.util.Arrays;

public class SwappinArrays {
    public static void main(String[] args){
        int arr[] = {4,3,8,6,5,1};
        int n = arr.length;
        int tmp = 0;
        System.out.println(Arrays.toString(arr));


        for(int i =0; i<=n-2; i++){
            int min = i;
            for (int j=i; j<=n-1; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }

        for (int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
