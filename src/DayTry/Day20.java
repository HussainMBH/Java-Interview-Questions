package DayTry;

public class Day20 {
    public static void main(String[] args) {
        Day20 obj = new Day20();
        obj.binarysearch();
    }
    void binarysearch(){
        int a[] = {8,10,4,1,5,7,6,2,3,9};
        int key = 6;
        for(int i=0; i<a.length; i++){
            int min = i;
            for(int j=i; j<a.length; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }

        int lb =0;
        int ub = a.length-1;
        while (lb<=ub){
            int mid = (lb+ub)/2;
            if(a[mid] == key){
                System.out.println("Your element " + a[mid] + " found at " + mid);
            }

            if(mid > key){
                ub = mid-1;
            }
            else {
                lb = mid + 1;
            }
        }

    }
}
