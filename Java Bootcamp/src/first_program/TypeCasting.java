package first_program;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int)(input.nextFloat());
        System.out.println(a);
    }
}
