import java.util.*;
public class GetEqualSubstringsWithinBudget{
    public static void main(String[] argu){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of S and T string");
        int n = sc.nextInt();

        System.out.println("Enter size of maxcost");
        int maxcost=sc.nextInt();

        System.out.println("Enter string S:");
        String s1 = sc.next();

        System.out.println("Enter string T:");
        String t = sc.next();

        int result = s.equalSubstring(s1,t,maxcost);
        System.out.println("Subarray of maximum sum "+ result);
        sc.close();    
         
    }
   
}

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
     
     int[] arr=new int[s.length()];
     for(int i=0;i<s.length();i++)
     {
        arr[i] = Math.abs(s.charAt(i)-t.charAt(i));   
     }  
     int start=0;
     int end=0;
     int maxlen=0; 
     int max =0;
     int sum=0;
     while(end<arr.length)
     {
        sum+=arr[end];
        //System.out.println("sum  "+ sum);
        while(sum>maxCost)
        {
            sum-=arr[start];
            start++;
        }
        maxlen=end-start+1;
        //System.out.println("maxlen  "+maxlen);
        max=Math.max(max,maxlen);
        //System.out.println("max  "+max);
        end++;
     }
     return max;
    }
}
