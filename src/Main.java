public class Main {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        //assigned arr[0] to min because in arrays min number will start from 0 array position
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] <min){
                min = arr[i];
            }

        }
        System.out.println(min);







        arrayquestions arq = new arrayquestions();
        arq.arrayques();




        StringBuffer name = new StringBuffer("Mohamed Bahir ");
        name = name.append("Hussain");

        String nm = "Bahir";

        System.out.println(name);
        System.out.println(nm);
//01-Q given name Agni please write in reverse
        String given = "Agni";

        StringBuffer buffer = new StringBuffer();
        buffer.append(given);

        System.out.println(buffer.reverse());

        //second method
        char[] chararray = given.toCharArray();
        String cha = "";
        for(int i = chararray.length - 1; i>=0; i--){
            cha = cha + chararray[i];
        }
        System.out.println(cha);


        int num[] = {1,2,3,4,5};

        StringBuffer buf  = new StringBuffer();
        buf.append(num);

        System.out.print(buf.reverse());
        System.out.println();

        String nam = "Bahir";
        int len = nam.length(); //Counting char length
        String rev = ""; // starting variable

        for(int i = len -1; i>=0; i--){
            rev = rev + nam.charAt(i); //r + ri + rih + riha + rihaB
        }
        System.out.println(nam.length());
        System.out.println(rev);
        System.out.println();

        StringBuffer buff = new StringBuffer();
        buff.append(nam);
        System.out.println(buff.reverse());


        String je = "Hussain";
        int lng = je.length();

        StringBuffer bfr = new StringBuffer();
        bfr.append(je);
        System.out.println(bfr.reverse());

        String jer = "";
        for (int i = lng -1; i>=0; i--){
            jer = jer + je.charAt(i);
        }
        System.out.println(jer);
        System.out.println();

        //Number pattern
        int pt[] = {1,2,3,4,5,6};
        int ptln = pt.length;
        int ptn = 0;
        for(int i = 0; i<=pt.length; i++){
           //ptn = pt[i];

            System.out.println(ptn);
        }

        int rows = 10;
        for(int i=rows; i>=1; --i){//for loop for row
            for(int j=1; j<=i; ++j){//for loop for colum
                System.out.print("*");
            }
            System.out.println();
        }

        int row = 10;
        for(int i=1; i<=row; ++i){//for loop for row
            for(int j=1; j<=i; ++j){//for loop for colum
                System.out.print("*");
            }
            System.out.println();
        }

        int ro=8;
        for (int i= 0; i<= rows-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= rows - 1 - i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        }
}