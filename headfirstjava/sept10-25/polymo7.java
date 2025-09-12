abstract  class Appliance {
   abstract void turnOn();
}
class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is ON.");
    }
}
class Light extends Appliance {
  @Override
  public void turnOn() {
      System.out.println("Light is ON.");
  }
}

public class polymo7 {
  public static void main(String[] args) {
    // Appliance a;
    // a = new Fan();
    // a.turnOn();
    // a = new Light();
    // a.turnOn();
    Appliance a1=new Fan();
    Appliance a2=new Light();
    a1.turnOn();
    a2.turnOn();
}

}
