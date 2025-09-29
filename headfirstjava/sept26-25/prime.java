
import java.util.Scanner;
public class prime {
     static boolean isPrime(int n){
          if(n==1||n==0) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
      return false;
            }
        }
        return true;
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number : ");
    int N=sc.nextInt();
for(int i=1;i<=N;i++){
  if(isPrime(i)){
    System.out.print(i+" ");
  }
  // if(i%2!=0){
  //   System.out.println("is prime");
  // }else{
  //   System.out.println("not prime");
// System.out.println(++N);
//   System.out.println(N++);
//   System.out.println(++N);
}sc.close();
  }
}