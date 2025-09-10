abstract class BankAccount {
  double balance;
  
  BankAccount(double balance) {
      this.balance = balance;
  }
  abstract void deposit(double amount);
  abstract void withdraw(double amount);
}
class SavingsAcc extends BankAccount {
  SavingsAcc(double balance) {
      super(balance);
  }
  void deposit(double amount) {
      balance += amount;
      System.out.println("Savings deposit: " + amount + ", Balance: " + balance);
  }
  void withdraw(double amount) {
      if (amount <= balance) {
          balance -= amount;
          System.out.println("Savings withdraw: " + amount + ", Balance: " + balance);
      } else {
          System.out.println("Insufficient funds.");
      }
  }
}
class CurrentAcc extends BankAccount {
  CurrentAcc(double balance) {
      super(balance);
  }
  void deposit(double amount) {
      balance += amount;
      System.out.println("Current deposit: " + amount + ", Balance: " + balance);
  }
  void withdraw(double amount) {
      if (amount <= balance) {
          balance -= amount;
          System.out.println("Current withdraw: " + amount + ", Balance: " + balance);
      } else {
          System.out.println("Insufficient funds.");
      }
  }
}
public class abs6 {
  public static void main(String[] args) {
    BankAccount acc1 = new SavingsAcc(1000);
    acc1.deposit(500);
    acc1.withdraw(200);
    BankAccount acc2 = new CurrentAcc(2000);
    acc2.deposit(1000);
    acc2.withdraw(1500);
}
}
