package assingments.conditionals_loops;

import java.util.Scanner;

public class hcf {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        int hcf = 1;

        for(int i = 2;i<=a || i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }

        System.out.println(hcf);
    }
}
