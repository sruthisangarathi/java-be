class Student{
  private String name;
  private int rollNumber;

  public String getName(){
    return name;
  }
  public int getRollNumber(){
    return rollNumber;

  }
  public void setName(String n){
    this.name=n;
  }
  public void setRollNumber(int r){
    this.rollNumber=r;
  }
}

public class encap1 {
  public static void main(String[] args){
    Student stu=new Student();
    stu.setName("sruthi");
    stu.setRollNumber(50);
    System.out.println("Name is:"+stu.getName());
    System.out.println("Roll number is:"+stu.getRollNumber());
  }
}
