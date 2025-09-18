import java.util.Scanner;
public class search {
  public static void main(String[] args){
    int[] arr={1,2,3,4,5,6,7,8,9};
    Scanner sc=new Scanner(System.in);
    System.out.print("enter  a number:");
    int a=sc.nextInt();
    boolean found = false;
    // for( int i=0;i<arr.length;i++){
    //   if(a==arr[i]){
    //     found = true;
    //             break;
    //   }
    // }
    int i=0;
    while(i<arr.length){
      if(a==arr[i]){
        found =true;
        break;
      }
      i++;
    }
    if (found) {
      System.out.println(a + " exists in array");
  } else {
      System.out.println(a + " doesn't exist in array");
  }
  sc.close();
  }
}



       
     
