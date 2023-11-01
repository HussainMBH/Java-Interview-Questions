import java.util.Arrays;

public class try1 {
    public static void main(String[] args){
        int ar[] = {1,2,2,3,4,5,6,6,7,8,9};
        int n = -1;
        int l = ar.length;
        for(int i=0; i<l; i++){
            if(ar[i]!= ar[i+1]){
                System.out.println(ar[i]);
            }
            if(ar[i]==ar[i+1]){
                System.out.println("It's duplicate "+ar[i]);
            }
        }
        System.out.println(Arrays.toString(ar));

    }
}
