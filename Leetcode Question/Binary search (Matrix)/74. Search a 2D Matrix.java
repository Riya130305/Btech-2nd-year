
import java.util.*;

public class Search_2d_matrix {
    public static void main(String[] args) {
        Solution s = new Solution(); // Use the correct class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int tc = sc.nextInt();

        while (tc-- > 0) {
            System.out.println("Enter target:");
            int target = sc.nextInt();

            System.out.println("Enter number of rows and columns:");
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println("Enter the elements of the matrix:");
            int[][] arr1 = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }

            boolean result = s.searchMatrix(arr1, target); // Pass target as an argument
            System.out.println("Target found: " + result);
        }

        sc.close();
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}
