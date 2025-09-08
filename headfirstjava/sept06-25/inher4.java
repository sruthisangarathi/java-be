class Bird {
  void sound() {
      System.out.println("Birds make sounds.");
  }
}

class Parrot extends Bird {
  @Override
  void sound() {
      System.out.println("Parrot says hiii");
  }
}

class Sparrow extends Bird {
  @Override
  void sound() {
      System.out.println("Sparrow chirping");
  }
}
public class inher4 {
  public static void main(String[] args) {
    Bird b1 = new Parrot();
    Bird b2 = new Sparrow();
    
    b1.sound();
    b2.sound();
}
}
