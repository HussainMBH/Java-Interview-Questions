import java.util.Arrays;

public class Move_All_Zero_at_Start_of_Array {
    public static void main(String[] args){
        int ar[]={1,0,3,5,6,0,7,0,8};
        int l = ar.length;
        int j=1;
        for (int i=l-1; i>=l; i--){
            if(ar[i] !=0){
                ar[l-j] = ar[i];
                j++;
            }
        }
        for(int i=0; i<l-(j-1); i++){
            ar[i]=0;
        }
        System.out.println(Arrays.toString(ar));
    }
}
