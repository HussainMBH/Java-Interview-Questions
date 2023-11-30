public class String_Reverse {
    public static void main(String [] args){
        String s1 = "Mohamed Bahir Hussain";
        int start = 0, end = s1.length()-1;
        for(int i=s1.length()-1; i>=0; i--){
            if(s1.charAt(i) != ' '){
                continue;
            }
            else {
                start = i+1;
                reverse(s1, start, end);
                end = i-1;
            }
        }
        reverse(s1, 0, end);
    }

    private static void reverse(String s1, int start, int end){
      String s2 = "";
      for(int i= start; i<= end; i++){
          s2 = s2 + s1.charAt(i);
      }
        System.out.print(s2 + " ");
    }
}
