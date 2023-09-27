import java.util.Arrays;

public class Arrayquestions {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};

        //reverse array
        int re[] = new int[a.length]; //up to a.length
        int j = a.length;
        for (int i=0; i<a.length; i++){
            re[j-1] = a[i]; //array index start from Zero so put minus to j-1
            j--; //from a.length end up to zero index
        }
        System.out.println(Arrays.toString(re));
    }
}