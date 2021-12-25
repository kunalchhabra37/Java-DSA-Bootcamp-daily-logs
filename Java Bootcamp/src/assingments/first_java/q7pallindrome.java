package assingments.first_java;

import java.util.Locale;
import java.util.Scanner;

public class q7pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s,r="";
        s = input.nextLine().toLowerCase(Locale.ROOT);
        int n = s.length();
        for(int i=n-1; i>=0;i--){
            r = r + s.charAt(i);
        }
        if(s.equals(r)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
