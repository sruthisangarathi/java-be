class Animal{
  void sound(){
    System.out.println("Sounds of animal");
  }
  class Dog extends Animal{
    @Override
    void sound(){
      System.out.println("Dog barks");
    }
  }
  class Cat extends Animal{
    @Override
    void sound(){
      System.out.println("cat meows");
    }
  }
}
public class poly9 {
  
  public static void main(String[] args){
    Animal a=new Animal();
a.sound();
Animal d=new Dog();
d.sound();
Animal c=new Cat();
c.sound();
  }
}
