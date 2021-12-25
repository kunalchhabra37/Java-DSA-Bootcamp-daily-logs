package first_program;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your Roll Number: ");
        int rNo = input.nextInt();
        System.out.print("Enter your Marks: ");
        float marks = input.nextFloat();

        System.out.println("Name: " + name + " Roll Number: " + rNo + " Marks: " + marks);

    }
}
