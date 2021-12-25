package assingments.conditionals_loops;

import java.util.Scanner;

public class q1factorial {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        int num = 1;
        for(int i = n;i > 0; i--){
            num *= i;
        }
        System.out.println(num);
    }
}
