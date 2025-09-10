class Shape{
  public void area(){
    System.out.println("area");
  }
}
  class Circle extends Shape{
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class polymo1 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);      
        Shape s2 = new Rectangle(4, 6); 
        s1.area();  
        s2.area();  
    }
}
