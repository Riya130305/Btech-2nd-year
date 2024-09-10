
import java.util.Scanner;
public class Main{
    public static int[][] reshape(int r, int c,int[][] mat) {
        int index=0;
        int[][] arr = new int[r][c];
       for(int i=0;i<mat.length;i++)
       {
           for(int j=0;j<mat[0].length;j++)
           {
               arr[index/c][index%c]= mat[i][j];
               index++;
           }
       }
    }
    public static void main(String[] agru){
       Scanner sc = new Scanner(System.in);
       //Scanner scr = new Scanner(System.in);
       int col = sc.nextInt();
       int row = sc.nextInt();
       int[][] mat = new int[row][col];
        for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               mat[i][j] = sc.nextInt();
           }
       }
       int c = sc.nextInt();
       int r =sc.nextInt();
       int[][] reshapedMatrix = reshape(c, r, mat);
        
        // Print the reshaped matrix
        System.out.println("Reshaped Matrix:");
        for (int[] r1 : reshapedMatrix) {
            for (int num : r1) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
