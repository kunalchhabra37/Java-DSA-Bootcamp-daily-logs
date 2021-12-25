package conditinals_loops;

import java.util.Scanner;

public class reverse {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num = in.nextInt();
        int rev = 0;
        while(num > 0){
            rev = rev*10 + num%10;
            num /= 10;
        }

        System.out.println(rev);
    }
}
