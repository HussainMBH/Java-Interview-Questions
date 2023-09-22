public class Main {
    public static void main(String[] args) {
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

    }
}