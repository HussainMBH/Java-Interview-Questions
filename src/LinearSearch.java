public class LinearSearch {
    public static void main(String[] args){
        int ar[] = {1,2,3,4,5,6};
        int key = 15;
        int l = ar.length;
        int flag=0;
        for(int i=0; i<l;i++){
            if(ar[i] == key){
                System.out.println("Found at here "+ ar[i]);
                flag =1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Key not found in here.");
        }
    }
}
