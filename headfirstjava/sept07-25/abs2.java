abstract class Shape {
  abstract void area();
}

class Circle extends Shape {
  double radius;
  Circle(double radius) {
      this.radius = radius;
  }
  void area() {
      System.out.println("Circle area: " + (3.14 * radius * radius));
  }
}
class Rectangle extends Shape {
  int length, breadth;
  Rectangle(int length, int breadth) {
      this.length = length;
      this.breadth = breadth;
  }
  void area() {
      System.out.println("Rectangle area: " + (length * breadth));
  }
}

public class abs2 {
  public static void main(String[] args) {
    Shape s1 = new Circle(5);
    Shape s2 = new Rectangle(4, 6);
    s1.area();
    s2.area();
}
}
