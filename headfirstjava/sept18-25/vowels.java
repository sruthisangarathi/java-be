
import java.util.Scanner;
public class vowels {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int vow=0,cons=0;
    System.out.println("Enter a string: ");
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
     
      if (ch >= 'a' && ch <= 'z') { 
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vow++;
            System.out.println("Number of vowels: " + vow);
        } else {
            cons++;
        }
    }
}
System.out.println("Number of vowels: " + vow);
System.out.println("Number of consonants: " + cons);
System.out.println(s.charAt(7));
sc.close();
    }
  }

