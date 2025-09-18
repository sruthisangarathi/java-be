import java.util.Scanner;

public class printnum {
  public static void main(String[] args){
   //1 to 10 
    for(int i=1;i<=10;i++){
      System.out.println(i);
    }
      //1 to 100 even numbers
    int x=100;
    for (int j=0;j<=x;j++){
      System.out.println(j);
      j++;
    }

    //multiplication
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number: ");
    int y=sc.nextInt();
    for(int k=1;k<=10;k++){
      System.out.println(+y+"x"+k+"="+(y*k));
    }

    //sum of first 10 natural numbers
    int sum=0;
    for(int l=0;l<=10;l++){
     sum += l;
    }
    // while(i <= 10) {
    //   sum += i;
    //   i++;
    System.out.println(sum);

    //factorial
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1; 
        for(int z = 1; z <= n; z++) {
            fact *= z; 
        }
        System.out.println("Factorial of " + n + " = " + fact);
        sc.close();
    }
    
}


  
  
