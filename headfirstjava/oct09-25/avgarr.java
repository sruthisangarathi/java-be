

public class avgarr {
  public static void main(String[] args){
    int[] arr={2,4,6,8,10,12,14};
    int avg,sum=0;
    int n=arr.length;
    for(int i=0;i<n;i++){
      sum+=arr[i];
    }
    avg=sum/n;
    System.out.println(avg);
  }
}
