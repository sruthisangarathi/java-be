import java.util.Scanner;
public class palindrom {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a strng");
    String str=sc.nextLine();
    String original=str;
    String rev="";
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      rev=c+rev;
    }
    System.out.println(rev);
    if(original==rev){
      System.out.println("is palindrome");
    }else{
      System.out.println("is not a palindrome");
    }
    sc.close();
  }
}
 