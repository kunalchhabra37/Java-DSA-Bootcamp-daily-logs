package assingments.first_java;

import java.util.Scanner;

public class q5largerNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        num1 = input.nextInt();
        num2 = input.nextInt();

        if(num1 > num2){
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }
}
