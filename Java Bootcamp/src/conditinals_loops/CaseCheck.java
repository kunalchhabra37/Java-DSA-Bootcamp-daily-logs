package conditinals_loops;

import java.util.Scanner;

public class CaseCheck {
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        char ch = in.next().trim().charAt(0);

        if(ch >='a' && ch <= 'z') {
            System.out.println("Lower Case");
        }else {
            System.out.println("Upper Case");
        }
    }
}
