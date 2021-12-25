package assingments.conditionals_loops;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PallindromeNum {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int num = in.nextInt();
        int rev = 0;
        int n = num;
        while(num > 0){
            rev = rev*10 + num%10;
            num /= 10;
        }

        System.out.println(rev==n);
    }

}
