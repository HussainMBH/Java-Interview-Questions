public class try1 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int rev = arr[0];
        for(int i =arr.length -1; i<arr.length; i--){
            rev = arr[i];
        }
        System.out.println(rev);
    }
}
