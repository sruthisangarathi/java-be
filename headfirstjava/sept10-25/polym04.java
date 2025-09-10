class Parent {
  public void displayInfo() {
      System.out.println("I am the parent class");
  }
}
class Child extends Parent {
  @Override
  public void displayInfo() {
      System.out.println("I am the child class with info.");
  }
}
public class polym04{
  public static void main(String[] args){
      Parent p;
      p = new Parent();
      p.displayInfo();  
      p = new Child();  
      p.displayInfo();  
}
  
}
