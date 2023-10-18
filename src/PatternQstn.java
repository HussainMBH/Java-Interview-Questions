public class PatternQstn {
    public static void main(String [] args){
        PatternQstn objrtn = new PatternQstn();
        objrtn.Starpatternfrwd();
        objrtn.boxpatter();
        objrtn.Starpatternrevrs();
        objrtn.rightsiderec();
        objrtn.boxpatrn();
        objrtn.incrbox();
        objrtn.decrbox();
        objrtn.numincr();
        objrtn.samenum();
        objrtn.decstar();
        objrtn.decnum();
        objrtn.trianglestar();
    }


    public void trianglestar(){
        System.out.println("Triangle Star");
        int n=6;
        for(int i=0; i<n; i++){
            // For printing the spaces before stars in each row
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            // For printing the stars in each row
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            // For printing the spaces after the stars in each row
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void decnum(){
        System.out.println("Decrease number");
        for(int i=6; i>0; i--){
            for(int j=1; j<i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public void decstar(){
        System.out.println("Decrease star pattern");
        for(int i=0; i<6; i++){
            for(int j=i; j<6; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void samenum(){
        for(int i=0; i<6; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void numincr(){
        System.out.println("Number Increase");
        for(int i=0; i<6; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }

    public void decrbox(){
        System.out.println("Decrease star patter");
        for(int i=0; i<6; i++){
            for(int j=i; j<6; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void incrbox(){
        System.out.println("Increase star Pattern");
        for(int i=0; i<6; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void boxpatrn(){
        System.out.println("Box Pattern");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
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

    int n = 5;
    public void rightsiderec(){
        for (int row = 0; row <2*n ; row++) {
            int totalcolsinrow = row > n ? 2 * n - row: row;
            for(int col = 0; col<totalcolsinrow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
