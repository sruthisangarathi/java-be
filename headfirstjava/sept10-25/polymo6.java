abstract class Employee{
  public abstract double getSalary();
}
class Intern extends Employee {
  @Override
  public double getSalary() {
      return 100; 
  }
}
class Developer extends Employee {
  @Override
  public double getSalary() {
      return 3949;
  }
}
class Manager extends Employee {
  @Override
  public double getSalary() {
      return 80339;
  }
}
public class polymo6 {
  public static void main(String[] args) {
    Employee[] employees = { new Intern(), new Developer(), new Manager() };

    for (Employee e : employees) {
        System.out.println("Salary: " + e.getSalary());
    }
}
}