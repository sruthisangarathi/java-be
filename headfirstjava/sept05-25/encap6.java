import java.util.Scanner;
class Rectangle{
  private double length;
  private double height;

  public double getLength(){
    return length;
  }
  public double getHeight(){
    return height;
  }
  public void setLength(double length){
    if(length>0){
      this.length=length;
    }else{
      System.out.println("Length must be positive");
    }
  }
  public void setHeight(double height){
    if(height>0){
      this.height=height;
    }else{
      System.out.println("Height must be positive");
    }
  }
  public double getArea(){
    return length*height;
  }
}

public class encap6 {
  public static void main(String[] args){
    Rectangle r=new Rectangle();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length:");
    double length=sc.nextDouble();
    System.out.println("enter height:");
    double height=sc.nextDouble();
    r.setLength(length);
    r.setHeight(height);
    r.getArea();
    // r.setLength(44);
    // r.setHeight(83);
    System.out.println("Area of rectangle:"+r.getArea());
    sc.close();
  }
}
