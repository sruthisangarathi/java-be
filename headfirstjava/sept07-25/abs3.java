abstract class Vehicle {
  abstract void fuelType();
}

class Car extends Vehicle {
  void fuelType() {
      System.out.println("Car runs on dieasel.");
  }
}
class Bike extends Vehicle {
  void fuelType() {
      System.out.println("Bike runs on petrol.");
  }
}
public class abs3 {
  public static void main(String[] args) {
    Vehicle v1 = new Car();
    Vehicle v2 = new Bike();
    v1.fuelType();
    v2.fuelType();
}
}
