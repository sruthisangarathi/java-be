class Vehicle{
  void fuelType(){
    System.out.println("Types of fuel");
  }
}
class Car extends Vehicle{
  @Override
  public void fuelType(){
    System.out.println("Car runs on petrol/diesel");
  }
}
class Bike extends Vehicle{
  @Override
  public void fuelType(){
    System.out.println("Bike runs on petrol/diesel");
  }
}
public class polymo2 {
 public static void main(String[] args){
  Vehicle[] v=new Vehicle[3];
  v[0] = new Car();
  v[1] = new Bike();
  v[2]= new Vehicle();
  for(Vehicle ve:v){
    ve.fuelType();
  }

 } 
}
