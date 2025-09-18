import java.util.Arrays;

public class index {
  public static void main(String[] args){
    int sum=0;
    int[] arr={1,2,3,425,6,7,8,9,0,32,5,232};
     Arrays.sort(arr);
    //Arrays.sort(arr, Collections.reverseOrder());
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2!=0){
        sum+=arr[i];
      }
    }
    System.out.println(sum);
  }
  }

 