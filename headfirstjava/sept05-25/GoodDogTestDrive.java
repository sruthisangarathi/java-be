class GoodDog{
  private int size;
  public int getSize(){
    return size;
  }
  public void setSize(int s){
    size=s;
  }
  void bark(){
    if(size>60){
      System.out.println("wooo");
    }else if(size>20){
      System.out.println("Rufff");
    }else{
      System.out.println("yipp");
    }
  }
}

public class GoodDogTestDrive {
  public static void main(String[] args){
    GoodDog gd=new GoodDog();
    gd.setSize(70);
    GoodDog gd1=new GoodDog();
    gd1.setSize(29);
    System.out.println("Dog size is "+gd.getSize());
    System.out.println("Dog1 size is "+gd1.getSize());
    gd.bark();
    gd1.bark();
  }
}
