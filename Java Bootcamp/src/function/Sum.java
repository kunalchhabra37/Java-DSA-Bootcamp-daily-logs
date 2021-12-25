package function;

import java.util.Scanner;

public class Sum {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println(sum());
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
