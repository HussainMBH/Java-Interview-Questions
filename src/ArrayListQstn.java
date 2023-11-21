import java.util.ArrayList;

public class ArrayListQstn {
    public static void main(String[] args){
        ArrayList<Integer> alist = new ArrayList<Integer>(); //Flexible for adding many elements
        for(int i= 0; i<=10; i++){
            alist.add(i);
        }
        System.out.println(alist);
    }
}
