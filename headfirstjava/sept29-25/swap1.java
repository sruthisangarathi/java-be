

public class swap1 {
  public static void main(String[] args){
    int a=3, b=4;
    //without temp
    a=a+b;
    b=a-b;
    a=a-b;
System.out.println("a:"+a+" b:"+b);

//with temp
// int temp;
// temp=a;
// a=b;
// b=temp;
// System.out.println("a:"+a+" b:"+b);
  }
}
