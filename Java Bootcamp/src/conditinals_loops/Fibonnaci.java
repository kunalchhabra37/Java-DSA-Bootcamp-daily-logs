package conditinals_loops;

import java.util.Scanner;

public class Fibonnaci {
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            b = a + b;
            a = b - a;
        }
        System.out.println(a);
    }
}
