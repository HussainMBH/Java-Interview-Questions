//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
public class adddigitnumlg {
    public static void main(String [] args){
        adddigitnumlg addgt = new adddigitnumlg();
        addgt.adddigit();
    }

    public void adddigit(){
        int num = 22855;
        if(num < 9){
            System.out.println(num);
        }
        else if (num % 9 == 0){
            System.out.println(9);
        }
        else {
            System.out.println(num%9);
        }

    }
}
