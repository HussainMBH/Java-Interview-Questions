package DayTry;

public class Day19 {
    String name;
    int price;
    int discount;
    public Day19(String name, int price, int discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
        //System.out.println("Product name is " + name + ". and this price is " + price + " rupees with " + discount + " rupees discount.");
    }

    public static void main(String[] args) {

        Day19 obj = new Day19("Biscuits", 150, 25);
        Day19 objscnd = new Day19("Soap", 200, 30);
        obj.sell();
        objscnd.sell();

    }


    void sell(){
        System.out.println("Our selling product is " + name + ".");
        System.out.println("This price is " + price + " rupees with " + discount + " rupees discount.");
    }

}
