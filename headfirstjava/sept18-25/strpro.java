
public class strpro {
  public static void main(String[] args){
    String s="hello wOSrld";
    System.out.println(s.length());
    System.out.println(s);
    
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      // System.out.println(c);
     // System.out.println((int)c);
       System.out.println(Character.isUpperCase(c));
      // System.out.println(Character.isLowerCase(c));
    }
  }
}
