import java.util.Scanner;

public class rev {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string: ");
    String s=sc.nextLine();
    String rev="";
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      rev=c+rev;
    }
    System.out.println(rev);
    sc.close();

    //reverse a number
    int num=123321;
    int original=num;
    int revnum=0;
    while(num!=0){
      int digit=num%10;
      revnum=revnum*10+digit;
      num=num/10;
    }
    System.out.println(revnum);
    if(original==revnum){
      System.out.println("is palindrome");
    }
    else{
      System.out.println("is not a palindrome");
    }
  }
}
