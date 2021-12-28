package array;

import java.util.Scanner;

public class ForEach {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
