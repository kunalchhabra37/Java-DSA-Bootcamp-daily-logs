package first_program;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float cel, far;
        cel = input.nextFloat();

        far = (9*cel/5) + 32;

        System.out.println(far);
    }
}
