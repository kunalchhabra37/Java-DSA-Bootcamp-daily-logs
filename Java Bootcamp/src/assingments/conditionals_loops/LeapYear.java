package assingments.conditionals_loops;

import java.util.Scanner;

public class LeapYear {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int year = in.nextInt();
        if(year%4 == 0){
            if(year%100 != 0){
                System.out.println("Leap Year");
            }else if(year%400 == 0){
                System.out.println("Leap Year");
            }else{
                System.out.println("Not a Leap Year");
            }
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
