package array;

import java.util.Scanner;

public class MultidimensionArray {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int row = 0;row < arr.length; row++){
            for(int col = 0;col < arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
        for(int row = 0;row < arr.length;row++){
            for(int col = 0;col < arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
