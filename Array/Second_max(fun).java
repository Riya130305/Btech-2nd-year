public class Main {
    public static int s_max(int[] arr) {
      int max1 = Integer.MIN_VALUE;
      int smax = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
           if(max1 < arr[i]){ 
             smax = max1;
             max1 = arr[i];
             }
             else if(smax < max1 && smax != max1)
        {
         smax = arr[i];
         }
               
      }
    
      return smax;
    }  


    public static void main(String[] args) {
      int[] arr = {2, 4,8,10,18};
      System.out.println(s_max(arr));
    
}
}
