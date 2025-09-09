class Employee{

  double calculateSalary(double basic){
    return basic+100;
  }
  double calculateSalary(double basic, double bonus){
    return basic+bonus;
  }
  double calculateSalary(double basic,double bonus, double overpay){
    return basic+bonus+overpay;
  }
}
public class poly7 {
  public static void main(String[] args){
    Employee em=new Employee();
    System.out.println("basic pay:"+em.calculateSalary(20304));
    System.out.println("basic & bonus:"+em.calculateSalary(9000,2848));
    System.out.println("bsic,bonus & overpay:"+em.calculateSalary(2983,48493,8474));
  }
}
