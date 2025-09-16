

public class large2 {
  public static void main(String[] args){

    //using if-else
    int a=20,b=1;
    if(a<b){
      System.out.println("B is largest: "+b);
    }else{
      System.out.println("A is largest: "+a);
    }

    //using ternary operator
    int num1 = 82, num2 = 22820;
int largest = (num1 > num2) ? num1 : num2;
System.out.println("Largest = " + largest);
 
//using math
int x = 1820, y = 0;
int large = Math.max(x, y);
System.out.println("Largest = " + large);

  }
}
