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
    }
}