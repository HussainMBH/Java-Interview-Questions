package DayTry;

import java.util.Arrays;

public class Day22 {
    public static void main(String[] args) {
        Day22 obj = new Day22();
        obj.binarysearch();
        obj.removebackspace();
        obj.removeunwantedspace();
        System.out.println();
        obj.firstrepeatedchar();
    }

    void firstrepeatedchar(){
        String a = "Mohamed Bahir Hussain";
        for(int i=0; i<=a.length()-1; i++){
            for(int j=i+1; j<=a.length()-1; j++){
                if(a.charAt(i) == a.charAt(j)){
                    System.out.println("Repeated character "+a.charAt(j) +" found at here");
                }
            }
        }
    }

    void removeunwantedspace(){
        String a = "Mohamed     Bahir      Hussain          ";
        boolean firstspace = false;
        for(int i=0; i<=a.length() -1; i++){
            char ch = a.charAt(i);
            if(ch != ' '){
                System.out.print(ch);
                firstspace = true;
            } else if(firstspace == true) {
                System.out.print(ch);
                firstspace = false;
            }
        }
    }

    void removebackspace(){
        String a = "Mohamed Bahir Hussain          ";
        System.out.println(a.length());
        int count = 0;
        int end = 0;
        for(int i= a.length()-1; i>0; i--){
            char ch = a.charAt(i);
            if(ch == ' '){
                continue;
            }
            else {
                end = i;
                break;
            }
        }
        for(int i=0; i<=end; i++){
            char ch = a.charAt(i);
            count++;
            System.out.print(ch);

        }
        System.out.println(count);
    }

    void binarysearch(){
        int a[] = {8,3,4,5,7,9,1,2,6,10};
        Arrays.sort(a);
        int flag = 0;
        int key = 8;
        int lb = 0;
        int ub = a.length-1;
        while (lb<ub){
            int mid = (lb+ub)/2;
            if(a[mid] == key){
                flag = 1;
                System.out.println("your element " + a[mid]+ " found at " + mid);
                break;
            }
            else if(mid> key){
                ub = mid -1;
            }
            else {
                lb = mid +1;
            }
        }

        if(flag == 0){
            System.out.println("Your element " + key+ " not found at here");
        }
    }
}
