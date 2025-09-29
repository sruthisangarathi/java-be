//counting length without .length()

public class len {
  public static void main (String[] args){
    int a=98765;
    int count=0;
    while(a!=0){
      a=a/10;
      count++;
    }
    System.out.println(count);
  }

}
