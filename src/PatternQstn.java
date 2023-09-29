public class PatternQstn {
    public static void main(String [] args){
        PatternQstn objrtn = new PatternQstn();
        objrtn.Starpatternfrwd();
        objrtn.boxpatter();
        objrtn.Starpatternrevrs();
    }

    public void Starpatternfrwd(){
        for (int row = 1; row <=5; row++) {
            //print for column
           for (int col = 1; col<=row; col++){
               System.out.print(col + " ");
           }
            //when one row printed finished than come to next row
            System.out.println();
        }
        System.out.println();
    }

    public void Starpatternrevrs(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j<= 5-i +1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void boxpatter(){
        for (int i = 1; i<6; i++){
            for (int j = 1; j<6; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
