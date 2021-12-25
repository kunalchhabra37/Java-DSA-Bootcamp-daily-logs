package assingments.conditionals_loops;

import java.util.Scanner;

public class SumofDigits {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num = in.nextInt();
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
