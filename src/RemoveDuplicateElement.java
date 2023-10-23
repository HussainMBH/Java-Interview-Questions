public class RemoveDuplicateElement {
    public static void main(String [] args){
        int ar[] = {1,1,1,2,2,3,4,4,5,5,6,6,6,7};
        int nw = -1;
        for(int i=0; i<ar.length; i++){
                if(ar[i] != -1){
                    for(int j=i+1; j<ar.length; j++){
                        if(ar[i] == ar[j]){
                            ar[j] = nw;
                        }
                    }
                    System.out.print(ar[i] + " ");
                }
        }
    }
}
