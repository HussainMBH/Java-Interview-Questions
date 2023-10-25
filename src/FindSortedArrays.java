public class FindSortedArrays {
    int SortedArray[] = {1,2,3,4,5,6};
    int UnSortedArray[] = {4,1,9,6,5};
    int l = SortedArray.length;
    int len = UnSortedArray.length;
    static boolean isSorted(int arr[], int n){
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5}, n = 5;

        System.out.println(isSorted(arr, n));
    }

}
