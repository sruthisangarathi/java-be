
public class Student {
  String name="Sruthi";
  public void greet(){
    System.out.println("Hello "+name);
  }
  public void attend(){
    System.out.println(name+" is attending");
  }
  public static void main(String[] args){
    //reference variable
    // Student s=new Student();
    // s.greet();

    //anonymous variable
    new Student().greet();
    new Student().greet();
new Student().attend();
  }
}
