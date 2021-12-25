package conditinals_loops;

import java.util.Scanner;

public class Largest {
    static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if(max < b){
//            max = b;
//        }
//        if(max < c){
//            max = c;
//        }
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
