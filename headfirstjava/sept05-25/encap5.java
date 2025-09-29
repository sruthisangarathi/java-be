import java.util.Scanner;
class Employee{
  private String name;
  private double salary;

  public String getName(){
    return name;
  }
  public double getSalary(){
    return salary;
  }
  public void setName(String name){
    if(name != null && name.trim().length() >= 5){
      this.name=name.trim();
    }else{
      System.out.println("Name must be at least 5 characters long");
    }
  }

  public boolean setSalary(double salary){
    if(salary>=10000){
      this.salary=salary;
      return true;
    }else{
      System.out.println("salary must be greater than 10000");
      return false;
    }
  }

}
public class encap5 {
  public static void main(String[] args){
   
    
    Scanner sc=new Scanner(System.in);
    Employee e =new Employee();
    do{
      System.out.println("Enter employee name:");
    String name=sc.nextLine();
    e.setName(name);
    }while(e.getName()==null);

    while(true){
    System.out.println("Enter employee salary:");
    double salary=sc.nextDouble();
    e.setSalary(salary);
    if(e.getSalary()>0) break;
    }
    
    System.out.println("Employee name:"+e.getName());
    System.out.println("Employee salary:"+e.getSalary());
    e.getName();
    e.getSalary();
;sc.close();
  }
}
