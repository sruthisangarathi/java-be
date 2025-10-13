

public class thro1 {
  public static void main(String[] args){
    prints(5);
  }
    public static void prints(int n){
      if(n<5){
        System.out.println("n shoukd be greater than 5");
        return;
      }
    
          int mid = n / 2;
          int width = n / 2 + 2;
  
          for (int i = 0; i < n; i++) {
              // ----- Print S -----
              if (i == 0 || i == mid || i == n - 1) {
                  for (int j = 0; j < width; j++) System.out.print('*');
              } else if (i < mid) {
                  System.out.print('*');
                  for (int j = 1; j < width; j++) System.out.print(' ');
              } else {
                  for (int j = 1; j < width; j++) System.out.print(' ');
                  System.out.print('*');
              }
  
              System.out.print("   "); // Space between S and R
  
              // ----- Print R -----
              if (i == 0 || i == mid) {
                  for (int j = 0; j < width; j++) System.out.print('*');
              } else if (i < mid) {
                  System.out.print('*');
                  for (int j = 1; j < width - 1; j++) System.out.print(' ');
                  System.out.print('*');
              } else {
                  System.out.print('*');
                  for (int j = 0; j < i - mid; j++) System.out.print(' ');
                  System.out.print('*');
              }
  
              System.out.println();
          }
      }
  }
  

