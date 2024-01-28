import java.util.ArrayList;

public class ArrayListQstn {
    public static void main(String[] args){
        ArrayList<Integer> alist = new ArrayList<Integer>(); //Flexible for adding many elements
        for(int i= 0; i<=10; i++){
            alist.add(i);
        }
        alist.add(5);
        alist.add(6);
        alist.add(2);
        alist.remove(3);
        System.out.println(alist);
    }
}
