

public class ref {
  public static void main(String[] args){
    int a=4;
    int b=4;
String c="hello";
String d="hello";
int[] arr={1,2,3};
int[] arr2={1,2,3};
String e=new String("hello");
String f=new String("hello");
String str1 = "123";
String str2 = "456";
int g=123;
    System.out.println(a==b);
    System.out.println(a=b);
    System.out.println(c=d);
    System.out.println(c==d);
    System.out.println(c.equals(d));
    System.out.println(c=e);
    System.out.println(c==e);
    System.out.println(c.equals(e));
    
    System.out.println(e=f);
    System.out.println(e==f);
    System.out.println(e.equals(f));
    System.out.println(arr==arr2);
    System.out.println(arr.equals(arr2));
  //   System.out.println(arr=arr2);
  //  System.out.println(System.identityHashCode(c));
  //  System.out.println(System.identityHashCode(d));
  //  System.out.println(System.identityHashCode(e));
  //  System.out.println(System.identityHashCode(f));
  System.out.println(System.identityHashCode(arr));
    System.out.println(System.identityHashCode(arr2));
int num1 = Integer.parseInt(str1); 
int num2 = Integer.valueOf(str2);
System.out.println(num1);
System.out.println(num2);
int num3=Integer.valueOf(g);
System.out.println(num3);
   }
}
