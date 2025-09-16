import java.util.Scanner;
import java.util.Arrays;
public class largearr {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    //using for loop
    int largest1 = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > largest1) 
        largest1 = arr[i];
    }
    System.out.println("Largest using for loop: " + largest1);

   //using for-each loop
    int largest2 = arr[0];
    for (int num : arr) {
        if (num > largest2)
         largest2 = num;
    }
    System.out.println("Largest using for-each loop: " + largest2);

    //using Arrays.sort()
    int[] arrCopy = Arrays.copyOf(arr, arr.length);
    Arrays.sort(arrCopy);
    System.out.println("Largest using Arrays.sort(): " + arrCopy[arrCopy.length - 1]);
sc.close();
  }
}



