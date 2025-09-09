  class Student {
    String name;
    int age;
    String city;

    void setDetails(String name) {
        this.name = name;
    }
    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void setDetails(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    
}
}
public class poly3 {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
s1.setDetails("sruthi");
    s2.setDetails("sr", 20);
    s3.setDetails("sneha", 22, "vizag");
    s1.display();
    s2.display();
    s3.display();
}
  }




