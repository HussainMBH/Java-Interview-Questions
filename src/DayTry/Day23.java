package DayTry;

public class Day23 {
    public static void main(String[] args) {
        Day23 obj = new Day23();
        obj.findsmallandbiggest();
        obj.scndlargestandsmallest();
    }

    void scndlargestandsmallest(){
        int a[] = {10,2,55,71,5,3,83,95,63,41,8, 125, 1,-2,-4};
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int scndmini = Integer.MAX_VALUE;
        int scndmaxi = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(mini > a[i]){
                scndmini = mini;
                mini = a[i];
            }
            if(maxi< a[i]){
                scndmaxi = maxi;
                maxi = a[i];
            }
        }
        System.out.println("Minimum number: " + mini);
        System.out.println("Second minimum number: " + scndmini);
        System.out.println("Maximum number: " + maxi);
        System.out.println("Second maximum number: "+ scndmaxi);
    }

    void findsmallandbiggest(){
        int a[] = {10,2,55,71,5,3,83,95,63,41,8, 125, 1};
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(mini>a[i]){
                mini = a[i];
            }
            if(maxi <a[i]){
                maxi = a[i];
            }
        }
        System.out.println("Maximum element " + maxi);
        System.out.println("Minimum element " + mini);
    }
}
