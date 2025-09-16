import java.util.logging.Logger;
import java.io.*;
public class hello {
  private static final Logger logger = Logger.getLogger(hello.class.getName());
  public static void main (String[] args) throws Exception{
    //using string.format()+system.out
    String name = "World";
    String msg = String.format("Hello, %s!", name);
    System.out.println(msg);
    
    //using system.err
    System.err.println("hello world!");

    //using system.out
    System.out.println("Hello World!");

    //using logger
    logger.info("hello world");
    
    //writing to a file instead of conole
    PrintWriter pw = new PrintWriter("output.txt");
    pw.println("Hello, World!");
    pw.close();
  }
}
