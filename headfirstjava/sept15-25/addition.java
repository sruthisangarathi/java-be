import java.util.Scanner;
public class addition {
  public static int add(int t, int u) {
    return t + u;
}
  public static void main(String[] args){

    //using direct intialization
    int a=10;
    int b=20;
    int addition=a+b;
    System.out.println("Addition: "+addition);

    //using scanner(input)
    Scanner sc=new Scanner(System.in);
    System.out.println("enter x:");
int x=sc.nextInt();
System.out.println("enter y:");
int y=sc.nextInt();
int result =x+y;
System.out.println("result : "+result);
sc.close();

//using method
System.out.println("Add = " + add(5, 10));



        //using interger.sum
        int sum = Integer.sum(5, 10);
        System.out.println("Sum = " + sum);

  }
 
}
