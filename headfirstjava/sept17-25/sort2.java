import java.util.Arrays;
public class sort2 {
      public static void main(String[] args) {
          int[] arr = {12, 5, 8, 20, 7, 15};
          Arrays.sort(arr);  
          System.out.println(Arrays.toString(arr));
          int secondSmallest = arr[1];  
          int secondLargest = arr[arr.length - 2];  
          System.out.println("Second smallest: " + secondSmallest);
          System.out.println("Second largest: " + secondLargest);
      }
  }
  


