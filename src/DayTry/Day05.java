package DayTry;

import java.util.Arrays;

public class Day05 {
    public static void main(String[] args){
        int a[] = {5,9,7,6,8,3,5,7,5,8,1,4};
        int l = a.length;
        System.out.println("Find Largest Element by using loop: " + findlargestnumber(a));
        System.out.println("Find Largest Element by using sorting: " + findlargestbysort(a));
        System.out.println(seconlargestelement(a));
        System.out.println(checksorted(a,l));
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

    static int findlargestbysort(int a[]){
        int l = a.length;
        Arrays.sort(a);
        return a[l-1];
    }

    static int seconlargestelement(int a[]){
        int l = a.length;
        int maxi = a[0];
        int scnflargest = Integer.MIN_VALUE;
        for(int i=0; i<l; i++){
           maxi = Math.max(maxi, a[i]);
        }
        for (int i=0; i<l; i++){
            if(scnflargest< a[i] && a[i] != maxi){
                scnflargest = a[i];
            }
        }
        return scnflargest;
    }

    static boolean checksorted(int a[], int l){
        
        for(int i=1; i<l; i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }
}
