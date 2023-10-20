import java.util.Arrays;

public class testhere {
    public static void main(String[] args){
        int ar[] = {8,5,3,7,9,1,10,6,2,4};
        int n=ar.length;
        for(int i=0; i<n-1; i++){
            int min =i;
            for(int j=i; j<n; j++){
                if(ar[j]<ar[min]){
                    min = j;
                }
            }
            int tmp = ar[min];
            ar[min] = ar[i];
            ar[i]=tmp;
        }
        System.out.println("Selection Sort: "+Arrays.toString(ar));

        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i-1; j++){
                if(ar[j]>ar[j+1]){
                    int tm = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1]=tm;
                }
            }
        }

        System.out.println("Bubble Sort: "+Arrays.toString(ar));

        /****************************************************************************************************************/
        System.out.println("Finding Maximum Number");
        int max = ar[0];
        for(int i=0; i<n; i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println(max);
       for(int i=0; i<n; i++){
           max = Math.max(max, ar[i]);
       }
        System.out.println(max);
        /****************************************************************************************************************/
        System.out.println("Finding Minimum Number");
        int min = ar[0];
        for(int i=0; i<n; i++){
            if(ar[i]<ar[min]){
                min = ar[i];
            }
        }
        System.out.println(min);
        for(int i=0; i<n; i++){
            min = Math.min(min, ar[i]);
        }
        System.out.println(min);
    }
}
