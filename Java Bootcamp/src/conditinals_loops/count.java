package conditinals_loops;

import java.util.Scanner;

public class count {
    public static final Scanner in = new  Scanner(System.in);

    public static void main(String[] args) {
        int num = in.nextInt();
        int digit = in.nextInt();
        int occ = 0;
        while(num > 0){
            if(num%10 == digit){
                occ++;
            }
            num = num/10;
        }

        System.out.println(occ);
    }
}
