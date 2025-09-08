import java.util.Scanner;
class ATM{
  private int pin;
  private double balance;

  public ATM(int pin, double balance) {
    if(String.valueOf(pin).length() == 4){
    this.pin = pin;
  }  else{
      System.out.println("Pin must be 4 digits");
    }
    this.balance = balance;
  }
  public boolean validatePin(int enteredPin){
    return this.pin==enteredPin;
  }
  void withdraw(double amount){
    if(amount>balance){
      System.out.println("Insufficient balance");
    }else{
      balance-=amount;
      System.out.println("Please collect your cash");
    }
  }
  
  void deposit(double amount){
      balance+=amount;
      System.out.println("Amount deposited successfully");
    
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


public class encap8 {
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int enteredPin;
    System.out.println("Set your pin");
    int pin=sc.nextInt();

    System.out.println("Enter initial balance:");
    double balance=sc.nextDouble();
    ATM atm=new ATM(pin,balance);
    System.out.println("Enter your pin");
    enteredPin=sc.nextInt();

    if(atm.validatePin(enteredPin)){
      System.out.println("1.Withdraw\n2.Deposit\n3.Check Balance");
      System.out.println("select your choice 1/2/3:");
      int choice=sc.nextInt();
     
      switch(choice){
        case 1:
          System.out.println("Enter amount to withdraw:");
          double wA=sc.nextDouble();
          atm.withdraw(wA);
          break;
        case 2:
          System.out.println("Enter amount to deposit:");
          double dA=sc.nextDouble();
          atm.deposit(dA);
          break;
        case 3:
          System.out.println("Your balance is:"+atm.getBalance());
          break;
        default:
          System.out.println("Invalid choice");
      }while(choice!=3);
    }else{
      System.out.println("Invalid pin");
    }
    sc.close();
  }
}
