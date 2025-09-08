class Person {
  String name;
  int age;
  
  Person(String name, int age) {
      this.name = name;
      this.age = age;
  }
  
  void display() {
      System.out.println("Name: " + name + ", Age: " + age);
  }
}

class Student extends Person {
  String course;
  
  Student(String name, int age, String course) {
      super(name, age);
      this.course = course;
  }
  
  void display() {
      super.display();
      System.out.println("Course: " + course);
  }
}

class Teacher extends Person {
  String subject;
  
  Teacher(String name, int age, String subject) {
      super(name, age);
      this.subject = subject;
  }
  
  void display() {
      super.display();
      System.out.println("Subject: " + subject);
  }
}
public class inher2 {
  public static void main(String[] args) {
    Student s = new Student("sruthi", 20, "maths");
    Teacher t = new Teacher("sri", 22, "science");
    
    s.display();
    t.display();
}
}
