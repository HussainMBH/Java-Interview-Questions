package OOP_Java.Inheritance.InheritanceOOP;

public class Dad extends Grandpa {
    public static void main(String[] args) {
        System.out.println("Hello i'm john, dad of peter");
        money();
        Car();
        Bank();

    }

    static void money(){
        System.out.println("i have $10M");
        System.out.println("I have bank account in Swiss Bank");
    }

    static void bike(){
        System.out.println("I have FZ V3.0");
    }
}
