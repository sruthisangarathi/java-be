class Shape{
  
  double area(double side){
    return side*side;
  }
  double area(double length,double breath){
    return length*breath;
  }
 double area(int radius){
  return Math.PI*radius*radius;
 }

    double area(double base, int height) {
        return 0.5 * base * height;
  }
}
public class poly4 {
  public static void main(String[] args){
    Shape s=new Shape();
    System.out.println("area of square: "+s.area(9));
    System.out.println("area of rectangle: "+s.area(2.3,7.6));
    System.out.println("area of circle: "+s.area(5));
    System.out.println("area of triangle: "+s.area(4.1,8));
  }
}
