class Employee {
  int id;
  String name;
  double salary;
  
  Employee(int id, String name, double salary) {
      this.id = id;
      this.name = name;
      this.salary = salary;
  }
  void display() {
      System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
  }
}
class Manager extends Employee {
  String department;
  
  Manager(int id, String name, double salary, String department) {
      super(id, name, salary);
      this.department = department;
  }
  
  void display() {
      super.display();
      System.out.println("Department: " + department);
  }
}

class Developer extends Employee {
  String programmingLang;
  
  Developer(int id, String name, double salary, String programmingLang) {
      super(id, name, salary);
      this.programmingLang = programmingLang;
  }
  
  void display() {
      super.display();
      System.out.println("Programming Language: " + programmingLang);
  }
}
public class inher5 {
  public static void main(String[] args) {
    Manager m = new Manager(1, "sri", 30000, "HR");
    Developer d = new Developer(2, "sruthi", 90000, "Java");
    
    m.display();
    d.display();
}
}
