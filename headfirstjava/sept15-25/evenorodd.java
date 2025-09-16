

public class evenorodd {
  public static void main(String[] args){

    //using simple modulus
    int a = 7;
if (a % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

//using bitwise
int b = 4;
if ((b & 1) == 0 ) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

//using ternary operator
int c = 2;
String result = (c % 2 == 0) ? "Even" : "Odd";
System.out.println(result);

//using switch state,ent
int num = 8;
switch (num % 2) {
    case 0:
        System.out.println("Even");
        break;
    case 1:
        System.out.println("Odd");
        break;
}

    }
  }

