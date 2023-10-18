import java.util.Arrays;

public class BubbleSortQuestion {
    public static void main(String[] args){
        int arr[] = {4, 1, 3, 9, 7};
        int n= arr.length;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
