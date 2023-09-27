import java.util.Arrays;

public class Arrayquestions {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};

        //reverse array

        int re[] = new int[a.length];
        int j = a.length;
        for(int i=0; i<a.length; i++){
            re[j-1] = a[i];
            j--;
        }
        System.out.println(Arrays.toString(re));
    }
}
