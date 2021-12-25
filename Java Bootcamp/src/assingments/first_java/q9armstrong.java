package assingments.first_java;

import java.util.Scanner;

public class q9armstrong {
    static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int num1,num2;
        num1 = input.nextInt();
        num2 = input.nextInt();

        for(int i=num1;i<=num2;i++){
            int n = Integer.toString(i).length();
            int sum=0,r=i;
            while(r>0){
                sum += Math.pow(r%10,n);
                r /= 10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
