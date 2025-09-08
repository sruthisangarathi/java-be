class Shape {
  void display() {
      System.out.println("This is a shape.");
  }
}

class Rectangle extends Shape {
  void area(int length, int breadth) {
      System.out.println("Rectangle area: " + (length * breadth));
  }
}

class Square extends Rectangle {
  void area(int side) {
      System.out.println("Square area: " + (side * side));
  }
}
public class inher3 {
  public static void main(String[] args) {
    Square s = new Square();
    s.display();
    s.area(4, 5);   // Rectangle method
    s.area(6);      // Square method
}
  
}
