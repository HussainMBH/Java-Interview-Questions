package DayTry;

public class Day20 {
    public static void main(String[] args) {
        Day20 obj = new Day20();
        obj.binarysearch();
        obj.countsoneelement();
    }

    void countsoneelement(){
        int a[] = {5,2,4,2,8,7,3,2,2,6,9,2,7,2,1,4,5};
        int count =0;
        for(int i=0; i<a.length; i++){
            if(a[i] == 2){
                count++;
            }
        }
        System.out.println("Total number two is " +count);
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
