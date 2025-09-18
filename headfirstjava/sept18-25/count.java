import java.util.Scanner;
import java .util.Arrays;
public class count {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a string: ");
          String s = sc.nextLine();
          String[] words = s.trim().split("\\s+");
          int wCount = s.trim().isEmpty() ? 0 : words.length;

          int sCount = 0;
          for (int i = 0; i < s.length(); i++) {
              if (s.charAt(i) == ' ') {
                  sCount++;
              }
          }
          System.out.println(Arrays.toString(words));
          System.out.println("Number of words : " + wCount);
          System.out.println("Number of spaces: " + sCount);
          int ad=wCount+sCount;
          System.out.println("Total count: "+ad);
          sc.close();
      }
  }
  
  
  

