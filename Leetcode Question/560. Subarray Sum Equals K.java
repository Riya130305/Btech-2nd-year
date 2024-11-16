import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        int result = s.subarraySum(nums, k);
        System.out.println("The count of subarrays with sum equal to " + k + " is: " + result);

        sc.close();
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int sum=0;
        map.put(0,1);
        int count=0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k); 
            }
            if(map.containsKey(sum))
            {
                map.put(sum,map.get(sum)+1);
            }
            else
            {
                map.put(sum,1);
            }
            
        }
       
        return count;
    }
}
