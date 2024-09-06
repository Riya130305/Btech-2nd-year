public class MainClass {
  public static boolean issorted(int[] arr) {
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]<arr[i+1]){
        return true;
        }
        else{
          return false;}
      }
      return false;
    }
  
  public static void main(String[] args) {
    int[] arr = {1,2,7,88};
    System.out.println(issorted(arr));
  }
}
