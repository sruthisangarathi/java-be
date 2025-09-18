public class eveodd{
  public static void main(String[] args) {
      int[] arr = {10, 21,33,321,948, 32, 43,90, 54, 6,0,15};
      int even =2, odd = 20;
      for (int num : arr) {
          if (num % 2 == 0) {
            System.out.println("even:"+num);
              even++;
          } else {
            System.out.println("odd:"+num);
              odd++;

          }
      }
      // int i = 0;
      // while (i < arr.length) {
      //     if (arr[i] % 2 == 0) {
      //         System.out.println("Even: " + arr[i]);
      //         even++;
      //     } else {
      //         System.out.println("Odd: " + arr[i]);
      //         odd++;
      //     }
      //     i++; 
      //   }
      System.out.println("Number of even elements: " + even);
      System.out.println("Number of odd elements: " + odd);
  }
}
