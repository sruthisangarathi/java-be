

public class find {
  public static int squa(int x) {
    return x * x;
}

public static int cuberoot(int x) {
    return x * x * x;
}
  public static void main(String[] args){
  //simple multiply
  int r=2;
  int sqrt=r*r;
  int cube=r*r*r;
  System.out.println("Square root: "+sqrt);
  System.out.println("Cube root: "+cube);

  //using math.pow
  int num = 3;
double square = Math.pow(num, 2);
double cubes = Math.pow(num, 3);
System.out.println("Square = " + square);
System.out.println("Cube = " + cubes);

//using loop
int x= 4;
int squar = 1, cub = 1;
for (int i = 0; i < 2; i++) {
    squar *= x;
}

for (int i = 0; i < 3; i++) {
    cub *= x;
}
System.out.println("Square = " + squar);
System.out.println("Cube = " + cub);

//using method
int b = 5;
        System.out.println("Square = " + squa(b));
        System.out.println("Cube = " + cuberoot(b));
  }
}
