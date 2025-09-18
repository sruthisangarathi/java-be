
public class hello {
  public static void main (String[] args) throws Exception{
    //using string.format()+system.out
    String name = "World";
    String msg = String.format("Hello, %s!", name);
    System.out.println(msg);
    
    //using system.err
    System.err.println("hello world!");

    //using system.out
    System.out.println("Hello World!");

    
  }
}
