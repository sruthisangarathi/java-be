

public class largearr {
  public static void main(String[] args){
    int [] arr={38393,39,92,74,291,4433,87689,4,7,1,78980,9769,79,0};
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
        //max=arr[i-1]; second largest number
        
      }
    }
    System.out.println("Largest element in array: "+max);
  }
}
