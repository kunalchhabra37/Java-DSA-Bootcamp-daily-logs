package assingments.conditionals_loops;

import java.util.Scanner;

public class ReverseString {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = in.nextLine().trim();
        int n = s.length();
        String a = "";
        for(int i = 0;i < n;i++){
            a = a + s.charAt(n-1-i);
        }
        System.out.println(a);
    }
}
