class BankAccount {
  double balance;
  
  BankAccount(double balance) {
      this.balance = balance;
  }
  void deposit(double amount) {
      balance += amount;
      System.out.println("Deposited: " + amount + ", Balance: " + balance);
  }
  void withdraw(double amount) {
      if(amount <= balance) {
          balance -= amount;
          System.out.println("Withdrew: " + amount + ", Balance: " + balance);
      } else {
          System.out.println("Insufficient balance.");
      }
  }
}
class SavingsAccount extends BankAccount {
  SavingsAccount(double balance) {
      super(balance);
  }
}
class FixedDepositAccount extends SavingsAccount {
  FixedDepositAccount(double balance) {
      super(balance);
  }
  void calculateInterest() {
      double interest = balance * 0.05;
      System.out.println("Interest: " + interest);
  }
}
public class inher6 {
  public static void main(String[] args) {
    FixedDepositAccount acc = new FixedDepositAccount(1000);
    acc.deposit(500);
    acc.withdraw(200);
    acc.calculateInterest();
}
}
