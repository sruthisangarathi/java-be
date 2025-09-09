class Bank{
  double calculateInterest(double principal, double time){
    double rate=3.4;
    return (principal * rate * time) / 100;
  }
  double calculateInterest(double principal, double time, double rate) {
    return (principal * rate * time) / 100;
}

double calculateInterest(double principal, double time, double rate, int n) {
    return principal * Math.pow((1 + (rate / 100) / n), n * time) - principal;
}
}
public class poly2 {
  public static void main(String[] args){
    Bank b=new Bank();
    System.out.println("simple interest:"+b.calculateInterest(23,4));
    System.out.println("simple interest: default rate: "+b.calculateInterest(23,5,10));
    System.out.println("compound interest: default rate: "+b.calculateInterest(3,2,10,2));;
  }
}
