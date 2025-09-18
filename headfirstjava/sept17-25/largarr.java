
public class largarr {
  public static void main(String[] args){
    int[] arr={3,5,7,32,9,54,90,1,2,100,6,8};
    int large=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]>large){ //less than < print smallest numbereveodd.jv
        large=arr[i];
      }
    }
    System.out.println(large);
  }
}
