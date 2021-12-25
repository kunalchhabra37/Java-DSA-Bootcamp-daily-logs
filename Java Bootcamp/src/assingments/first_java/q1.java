package assingments.first_java;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%2==1){
            System.out.println("Number is Odd");
        }
        else {
            System.out.println("Number is Even");
        }
    }
}
