

public class smallarr {
  public static void main(String[] args){
    int[] arr={11,12,23,45,67,8844343,1234,531,23443,51,31,41,2,3,4,5,6,7,8,9};
    int min=arr[0];
    for(int i=0;i<arr.length;i++)
    if(min>arr[i]){
     min=arr[i];
    }
    System.out.println(min);
  }
}
