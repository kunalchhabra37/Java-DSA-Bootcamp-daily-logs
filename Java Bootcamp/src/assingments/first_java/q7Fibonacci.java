package assingments.first_java;

import java.util.Scanner;

public class q7Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, f0=0,f1=1;
        n = input.nextInt();

        for(int i=0;i<n;i++){
            System.out.println(f1);
            f1 = f1 + f0;
            f0 = f1-f0;
        }
    }
}
