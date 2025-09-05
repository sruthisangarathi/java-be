class Car{
  private String brand;
  private int speed;

  public String getBrand(){
    return brand;
  }
  public int getSpeed(){
    return speed;
  }
  public void setBrand(String b){
    this.brand=b;
  }
  public void setSpeed(int s){
    if(s>0){
      this.speed=s;
    }else{
      System.out.println("speed cannot be negative");
    }
  }
}

public class encap2 {
  public static void main(String[]args){
    Car c=new Car();
    c.setBrand("Toyota");
    c.setSpeed(90);
    System.out.println("Brand is:"+c.getBrand());
    System.out.println("Speed is:"+c.getSpeed());

  }
}
