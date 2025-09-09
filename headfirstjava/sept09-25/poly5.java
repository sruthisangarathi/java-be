class Printer {

  void printData(int a) {
      System.out.println("Integer: " + a);
  }
  void printData(double d) {
      System.out.println("Double: " + d);
  }
  void printData(String s) {
      System.out.println("String: " + s);
  }
  void printData(int[] arr) {
      System.out.print("Array: ");
      for (int x : arr) {
          System.out.print(x + " ");
      }
      System.out.println();
  }
}

public class poly5 {
  public static void main(String[] args){
    Printer p=new Printer();
      p.printData(49382);
      p.printData(38.239);
      p.printData("Sangarathi");
      p.printData(new int[]{1, 2, 3, 4,53,333,21});
}
  }

