class Vehicle {
  void drive() {
      System.out.println("Vehicle is driving");
  }
}

class Car extends Vehicle {
  void fuelType() {
      System.out.println("Car runs on diesel");
  }
}
public class inher1 {
  public static void main(String[] args) {
    Car c = new Car();
    c.drive();
    c.fuelType();
}
}
