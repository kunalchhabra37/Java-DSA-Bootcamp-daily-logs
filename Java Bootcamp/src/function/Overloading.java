package function;

public class Overloading {
    public static void main(String[] args) {
        price(100,20);
    }
    static void price(int price){
        System.out.println(price);
    }
    static void price(int price, float dis){
        System.out.println((int)(price*((100-dis)/100)));
    }

}
