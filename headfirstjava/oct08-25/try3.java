

public class try3 {
  public static void main(String[] args){
    //multiple try
    try{
      int zer=5/0;
      System.out.println(zer);
    }
    catch(ArithmeticException e){
      System.out.println("Arithmetic Exception");
    }
    try{
      int arr[]=new int[5];
      arr[10]=25;
      System.out.println(arr[10]);
  }
  catch(ArrayIndexOutOfBoundsException e){
      System.out.println("ArrayIndexOutOfBounds Exception");
    }
    finally{
      System.out.println("finally block");
    }
  }
}
