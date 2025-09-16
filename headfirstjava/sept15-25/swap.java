import java.util.Scanner;
public class swap {
  public static void main(String[] args){
   
    //using third variable
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);


        //without using third variable 
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        System.out.print("Enter d: ");
        int d = sc.nextInt();
        System.out.println("Before swapping: c = " + c + ", d = " + d);
        c = c + d; 
        d = c - d; 
        c = c - d;
        System.out.println("After swapping: c = " + c + ", d = " + d);
         sc.close();
    }
}

    

  
