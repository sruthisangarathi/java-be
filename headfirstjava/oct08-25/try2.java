

public class try2 {
  public static void main(String[] args){
    try{
    int zero=5/0;
    System.out.println(zero);
    }catch(ArithmeticException e){
      System.out.println("Arithmetic Exception");
    }
    finally{
      System.out.println("finally block");
    }
  }
}
