package DayTry;

import java.util.Arrays;

public class Day14 {
    public static void main(String[] args) {
        Day14 objday = new Day14();
        objday.selectionsorting();
        objday.bubblesorting();
        objday.binarysearch();
        objday.changetouppercase();
        System.out.println();
        objday.findsortedarray();
        objday.braceboxpattern();
        objday.changetolawercase();
        System.out.println();
        objday.countwords();
    }
    void countwords() {
        String s = "mOHAMED bAHIR hUSSAIN";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ' && (i + 1 < s.length()) && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        // Increment count for the last word if the string is not empty
        if (!s.isEmpty()) {
            count++;
        }
        System.out.println(count);
    }
//    void countwords(){
//        String s = "mOHAMED bAHIR hUSSAIN";
//        int count = 0;
//        for(int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            if(ch == ' ' && ch + 1 != ' '){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//    }

    void changetolawercase(){
        String s = "HELLO MOHAMED BAHIR HUSSAIN";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>= 'A' && ch<= 'Z'){
                ch = (char) (ch+32);
                System.out.print(ch);
            }
            else {
                System.out.print(ch);
            }
        }
    }

    void braceboxpattern(){
        char a = '{', b = '}';
        int key = 3;
        for(int i=1; i<=key; i++){
            for(int j=1; j<=i; j++){
                for(int k=1; k<=j; k++){
                    System.out.print(a);
                }
                for(int k=1; k<=j; k++){
                    System.out.print(b);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void findsortedarray(){
        int a[] = {1,2,3,4,5,7,8};
        for(int i=0; i<a.length - 1; i++){
            if (a[i] <a[i+1]){
                continue;
            }
            else {
                System.out.println("It's not sorted array");
            }
        }
    }

    void changetouppercase(){
        String s = "MOhAMeD BAhIr HuSsaIN";
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch = (char) (ch + 32);
                System.out.print(ch);
            }
            else if(ch>='a' && ch<='z') {
                ch = (char) (ch -32);
                System.out.print(ch);
            }
            else {
                System.out.print(ch);
            }
        }

    }

    void selectionsorting(){
        int a[] = {5,9,7,3,1,10,4,8,2,6};
        int l = a.length;
        for(int i=0; i<l-1; i++){
            int min = i;
            for(int j=i; j<l; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }

        System.out.println(Arrays.toString(a));
    }

    void bubblesorting(){
        int a[] = {5,9,7,3,1,10,4,8,2,6};
        int l = a.length;
        for (int i=l-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    void binarysearch(){
        int a[] = {10,20,30,40,50,60,70,80,90};
        int key = 100;
        int lb = 0;
        int ub = a.length-1;
        int flag = 0;
        while (lb<=ub){
            int mid = (lb+ub)/2;
            if(a[mid] == key){
                System.out.println("Found at " + mid);
                flag = 1;
                break;
            } else if (mid < key) {
                lb = mid +1;

            } else if (mid > key) {
                ub = mid -1;
            }
        }
        if(flag == 0){
            System.out.println("element not found");
        }

    }
}
