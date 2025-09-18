
import java.util.Arrays;
public class revarr {
  public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    // int[] rev = new int[arr.length];

    // for (int i = 0; i < arr.length; i++) {
    //     rev[i] = arr[arr.length - 1 - i];
    // }

    // System.out.println("Reversed array:");
    // for (int num : rev) {
    //     System.out.print(num + " ");
    // }

    int n = arr.length;
    for (int i = 0; i < n / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = temp;
    }
    System.out.print("Reversed array:"+Arrays.toString(arr));
    for (int num : arr) {
        System.out.print(num + " ");
    }
  }
}
     
 
