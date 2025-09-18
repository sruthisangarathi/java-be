

public class palindrome {
  public static void main(String[] args){
    String s="madam";
    String rev="";
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      rev=c+rev;
    }
    if(rev.equals(s)){
System.out.println("is palindrome");
    }else{
      System.out.println("is not a palindrome");
    }
  }
}
