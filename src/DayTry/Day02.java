package DayTry;

public class Day02 {
    public static void main(String[] args){
        int a[] = {1,2,3,5,6,7};
        int l = a.length;
        //find missing number
        for(int i=1; i<l; i++){
            int flag = 0;
            for(int j=0; j<l; j++){
                if(a[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Find Missing Number: " + i);
            }
        }
    }

    public static int linearsearch(){
        int a[] = {1,2,3,5,6,7};

    }
}
