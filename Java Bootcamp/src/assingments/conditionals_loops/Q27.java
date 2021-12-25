package assingments.conditionals_loops;

import java.util.Scanner;

public class Q27 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int neg=0, pose=0,posd=0;
        while(true){
            int n = in.nextInt();
            if(n < 0){
                neg += n;
            }else if(n==0) {
                System.out.println("Negative sum: " + neg);
                System.out.println("Positive odd sum: " + posd);
                System.out.println("Positive even sum: " + pose);
                break;
            }else if(n%2 == 0){
                pose += n;
            }else{
                posd += n;
            }
        }
    }
}
