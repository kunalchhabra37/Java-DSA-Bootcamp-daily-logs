package assingments.first_java;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        float result = 0;
        System.out.println("Enter two number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Enter the Operator: ");
        String o = input.next();

        if(o.equals("+")){
            result = num1 + num2;
        }
        else if(o.equals("-")){
            result = num1 - num2;
        }
            else if(o.equals("*")){
                result = num1 * num2;
        }
                else if(o.equals("/")) {
            result = num1 / num2;
        }
        System.out.println(result);
    }
}
