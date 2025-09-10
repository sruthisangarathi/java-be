class Payment {
  public void pay(double amount) {
      System.out.println("Generic payment of Rs." + amount);
  }
}
class CreditCardPayment extends Payment {
  @Override
  public void pay(double amount) {
      System.out.println("Paid Rs." + amount + " using Credit card");
  }
}
class DebitCardPayment extends Payment {
  @Override
  public void pay(double amount) {
      System.out.println("Paid Rs." + amount + " using Debit card");
  }
}
class UPIPayment extends Payment {
  @Override
  public void pay(double amount) {
      System.out.println("Paid Rs." + amount + " using UPI");
  }
}
public class polymo5{
  public static void main(String[] args) {
      Payment p1=new CreditCardPayment();
      Payment p2=new DebitCardPayment();
      Payment p3=new UPIPayment();
      p1.pay(200);
      p2.pay(383983);
      p3.pay(10000);
  }
}
