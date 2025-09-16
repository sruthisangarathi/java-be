

public class large3 {
  public static void main(String[] args){
    int a=2,b=66,c=9;
    if(a > b && a > c) {
      System.out.println(a + " is the largest.");
  } else if(b > a && b > c) {
      System.out.println(b + " is the largest.");
  } else if(c > a && c > b) {
      System.out.println(c + " is the largest.");
  } else {
      System.out.println("Some numbers are equal and largest.");
  }

  //using math
  int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest = " + largest);
  

  //using nested ternary
  int f=4,d=9,e=5;
  int large=(f>d)?((f>e)?f:e):((d>e)?d:e);
  System.out.println("Largest number is:  " + large);
}
}
