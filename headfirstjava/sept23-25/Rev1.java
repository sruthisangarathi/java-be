//reversing number without using string
public class Rev1 {
  public static void main(String[] args){
    int num= 12345;
    int rev=0;
    while(num!=0){
      rev=num%10;
      num=num/10;
      // System.out.println(num);
      // rev=rev*10+rev;
     System.out.print(rev);
    }
   
  }
}
