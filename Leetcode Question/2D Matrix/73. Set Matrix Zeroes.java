import java.util.*;

public class SetMatrixZeroes {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("no. of test case");
        int tc=sc.nextInt();
        while(tc-- >0)
        {
            System.out.println("matrix row ");
            int r=sc.nextInt();

            System.out.println("nad column");
            int c=sc.nextInt();

            int[][] arr = new int[r][c];

            System.out.println("Array");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                    {
                        arr[i][j]=sc.nextInt();
                    }
            }

            setZeroes(arr);
            
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                System.out.print(arr[i][j]  + " ");
        }
        System.out.println();

    } 
    sc.close();
}

    public static void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        // System.out.println("r"+r);
        // System.out.println("c"+c);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int k=0;k<c;k++)
                    {
                        if(matrix[i][k]!=0)
                        {
                            matrix[i][k]=1000000007;
                        }
                    }
                    for(int m=0;m<r;m++)
                    {
                        if(matrix[m][j]!=0)
                        {
                            matrix[m][j]=1000000007;
                        }
                    }
                }
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==1000000007)
                {
                    matrix[i][j]=0;
                }
            }
            
        }
    }
}


