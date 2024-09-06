public class Main{
  public static int binarys(int[] arr,int start, int mid,int last,int search){
    while(start <= last){
      for(int i=0;i<mid;i++){
          if(arr[mid] == search){
            return i;
            }
          else if(arr[mid] > search){//2>89
            mid += i;
            }  
          else{
            mid -= i;
            }
        }
      
      }
      return -1;
  }
  public static void main(String[] argu){
    
    int[] arr = {2,23,77,89,90};
    int search = 89;
    int start = 0;
    int last =arr.length-1;
    int mid = arr.length/2;
    
