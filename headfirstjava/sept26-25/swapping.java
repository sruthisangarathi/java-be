

public class swapping {
  public static void main(String[] args){
    int a=30, b=100;
    System.out.println("Before swapping a=" + a + " b=" + b );
   a= a+b;
   b=a-b;
   a=a-b;
   System.out.println("After swapping a=" + a + " b=" + b );
  }
}
