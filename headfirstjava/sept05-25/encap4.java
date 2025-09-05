class BankAccount{
  private double balance;
  
  public BankAccount( double balance) {
    this.balance = balance;
}
  void deposit(double amount){
    balance+=amount;
  }
  void withdraw(double amount){
    if(amount<=balance){
      balance-=amount;
    }else{
      System.out.println("Insufficient balance");
    }
  }
    public double getBalance(){
      return balance;
    }
    public void setBalance(double balance){
      if(balance>=0){
        this.balance=balance;
      }else{
        System.out.println("invalid balance");
      }
  }

}

public class encap4 {
  public static void main(String[]args){
    BankAccount ba=new BankAccount(5000);
    ba.deposit(2000);
    System.out.println("Balance after deposit is:"+ba.getBalance());
    ba.withdraw(1000);
    
    // ba.withdraw(2000);
    // ba.withdraw(100);
    System.out.println("Balance after withdraw is:"+ba.getBalance());
  }
  
}

