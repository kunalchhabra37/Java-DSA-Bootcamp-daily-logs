package function;

import java.util.Scanner;
import java.util.*;

public class Prime {
    public static Scanner in = new Scanner(System.in);

    static String prime(int n){
        String temp = "Prime";
        for(int i = 2;i <= Math.pow(n,0.5);i++){
            if(n%i == 0){
                temp = "Not a Prime";
                return temp;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int n = in.nextInt();
        System.out.println(prime(n));
    }
}
