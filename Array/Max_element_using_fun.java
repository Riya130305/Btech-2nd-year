public class Main {
    public static int max(int[] arr) {
      int max1 = 0;
      for (int i = 0; i < arr.length; i++) {
           if(max1 < arr[i]){ 
             max1 = arr[i];
             }
      }
      return max1;
    }  


    public static void main(String[] args) {
      int[] arr = {2, 34, 90, 11, 98};
      System.out.println(max(arr));
    
}
}
