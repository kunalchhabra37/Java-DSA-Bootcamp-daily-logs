package assingments.conditionals_loops;

import java.util.Scanner;

public class Q2Discount {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int price = in.nextInt();
        int discount = in.nextInt();

        price -= price*discount;

        System.out.println(price);
    }
}
