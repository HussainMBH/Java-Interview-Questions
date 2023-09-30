public class StringQstn {
    public static void main(String[] args){
        String name = "BahirHussain";
        //Default count
        System.out.println(name.length());

        //String convert to Chararray and count
        char[] namearr = name.toCharArray();
        int namelength = 0;
        for(char c:namearr){
            namelength++;
        }
        System.out.println(namelength);
    }
}
