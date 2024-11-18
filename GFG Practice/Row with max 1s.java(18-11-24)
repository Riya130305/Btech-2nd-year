package Binary_search;
import java.util.*;

public class row_with_max_one{
    public static void main(String[] args){
        one s = new one();
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-->0)
       { System.out.println("row size");
        int n=sc.nextInt();

        System.out.println("column size");
        int m=sc.nextInt();

        int[][] arr1 = new int[n][m]; 

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
    
        int result=s.rowWithMax1s(arr1);
        System.out.println("max row "+ result);

        tc--;}
        sc.close();
    }
}

class one {
    public int rowWithMax1s(int arr[][]) {
        // code here
    
    int max =0;
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
           int a=leftside(arr[i]);
            if(a>max)
            {
                max = a;
                index=i;
            }
        }
        return index;
    }
    int leftside(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==1)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans!=-1?arr.length-ans:0;
    }
}
