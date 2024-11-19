import java.util.*;
public class subset {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("no. of test case");
        int tc=sc.nextInt();
        while(tc-- >0)
        {
            System.out.println("enter the length of the array");
            int n=sc.nextInt();

            int[] nums = new int[n];
            System.out.println("array");
            for(int i=0;i<n;i++)
            {
                nums[i] = sc.nextInt();
            }
            List<List<Integer>> ans=subsets(nums);
            System.out.println(ans);
        }

    }

    public  static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        int n=nums.length;
        int p=(int)Math.pow(2,n);
 
        for(int i=0;i<p;i++)
        {
             List<Integer> arr1 = new ArrayList<>();
             for(int j=0;j<n;j++)
             {
                 if((i & (1<<j)) !=0)
                 {
                     arr1.add(nums[j]);
                     //System.out.println(arr);
                 }
             }
             arr.add(arr1);
        }
        
        
     return arr;
     }
}
