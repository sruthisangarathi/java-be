class Bank{
  public double getRateOfInterest(){
    return 0.0;
  }
}
class SBI extends Bank{
  @Override
  public double getRateOfInterest(){
    return 6;
  }
}
class ICICI extends Bank{
  @Override
  public double getRateOfInterest(){
    return 7.3;
  }
}
class HDFC extends Bank{
  @Override
  public double getRateOfInterest(){
    return 5.5;
  }
}
public class polymo3 {
  public static void main(String[] args){
    Bank b1=new SBI();
    Bank b2=new ICICI();
    Bank b3=new HDFC();
    System.out.println("SBI ROI: "+b1.getRateOfInterest());
    System.out.println("ICICI ROI: "+b2.getRateOfInterest());
    System.out.println("HDFC ROI: "+b3.getRateOfInterest());
  }
}
