// Source code is decompiled from a .class file using FernFlower decompiler.
public class Dog {
  String name;

  public Dog() {
  }

  public static void main(String[] var0) {
     Dog var1 = new Dog();
     var1.bark();
     var1.name = "puppy";
     Dog[] var2 = new Dog[]{new Dog(), new Dog(), var1};
     var2[0].name = "snoopy";
     var2[1].name = "tumm";
     System.out.print("last dog’s name is ");
     System.out.println(var2[2].name);

     for(int var3 = 0; var3 < var2.length; ++var3) {
        var2[var3].bark();
     }

  }

  public void bark() {
     System.out.println(this.name + " says Ruff!");
  }

  public void eat() {
  }

  public void chaseCat() {
  }
}
