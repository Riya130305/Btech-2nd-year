import java.util.Scanner;
public class MainClass {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,7};
    int[] arr1 = new int[arr.length];
    // Scanner sc = new Scanner(System.in);
    for(int i=0;i<arr.length;i++)
    {
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      arr1[i] =n; 
    }
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);  
    }
      
    }
}
