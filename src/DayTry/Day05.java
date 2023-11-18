package DayTry;

public class Day05 {
    public static void main(String[] args){
        int a[] = {5,9,7,6,8,3,5,7,5,8,1,4};
        System.out.println("Find Largest Element: " + findlargestnumber(a));
    }

    static int findlargestnumber(int a[]){

        int l = a.length;
        int max = a[0];
        for(int i=0; i<l; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
}
