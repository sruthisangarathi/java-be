

public class Employee {
  int orgId=293;
  String orgName="Imaginnovate";
  String ceo="Krishna";
  int noOfDept=4;
  static double netWorth=500;
  public static void main(String[] args){
int eid =101;
String empName ="Thon";
double salary =5000.00;
Employee e1= new Employee();
e1.getOrgID();
System.out.println(Employee.getNetworth());
Employee e2= new Employee();
e2.deleteEmployee (101);
//Thread.start(5000);
  }
public int getOrgID() {
  return orgId;
}
public static double getNetworth() { 
  return netWorth; 
}
public void deleteEmployee(int erpID) {}
  }
 

 