package assingments.first_java;

import java.util.Scanner;

public class q3SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,t;
        System.out.println("Enter Principal amount: ");
        p = input.nextInt();
        System.out.println("Enter Rate of Interest: ");
        float r = input.nextFloat();
        System.out.println("Enter Time Period: ");
        t = input.nextInt();

        float simpleInterest = p*r*t/100;

        System.out.println(simpleInterest);
    }
}
