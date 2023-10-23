public class FindSortedArrays {
    int SortedArray[] = {1,2,3,4,5,6};
    int UnSortedArray[] = {4,1,9,6,5};
    int l = SortedArray.length;
    int len = UnSortedArray.length;
    public static void main(String[] args){
        FindSortedArrays fndsrtary = new FindSortedArrays();
        boolean SortedArrays = fndsrtary.SortedArrays();
        if (SortedArrays) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

    public boolean SortedArrays(){
        int SortedArray[] = {1, 2, 3, 4, 5, 6};
        int l = SortedArray.length;
        for(int i=1; i<l; i++){
            if(SortedArray[i]>=SortedArray[i-1]){

            }
            return false;
        }
        return true;
    }

}
