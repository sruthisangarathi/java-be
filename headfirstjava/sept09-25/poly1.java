class Calculator{
int multiply(int a, int b){
return a*b;
}
int multiply(int a, int b, int c){
  return a*b*c;
}
double multiply(double a, double b){
  return a*b;
}
double multiply(double a, int b){
  return a*b;
}
}
public class poly1 {
  public static void main(String[] args){
Calculator c=new Calculator();
System.out.println("Mul of 2num:"+c.multiply(10,3));
System.out.println("Mul of 3num:"+c.multiply(2,3,4));
System.out.println("Mul of 2floatnum:"+c.multiply(1.5,2.5));
System.out.println("Mul of ifloat & 1int:"+c.multiply(2.5,3));
  }
  
}


  