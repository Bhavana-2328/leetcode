package src;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int row = 0;row< arr.length;row++){
            for(int col = 0;col< arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
//        for(int row = 0;row< arr.length;row++){
//            for(int col = 0;col< arr[row].length;col++){
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }
//        for(int[] a : arr){
//            System.out.println(Arrays.toString(a));
//        }
//        for(int row = 0;row< arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
    }
}
