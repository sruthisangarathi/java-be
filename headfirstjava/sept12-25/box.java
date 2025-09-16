class Box {
  int value;
  Box next;
}
public class box {
  public static void main(String[] args) {
    Box b1 = new Box();
    b1.value = 5;
    Box b2 = new Box();
    b2.value = 10;
    b1.next = b2;
    System.out.println("b1 value: " + b1.value);
    System.out.println("b2 value: "+b2.value);
}
}
