public class Main {
    public static int search(int[] arr, int s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
      int[] arr = {2, 34, 90, 11, 98};
      System.out.println(search(arr, 34));
    
}
}
