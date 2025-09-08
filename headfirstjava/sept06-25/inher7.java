class Sports {
  void play() {
      System.out.println("Playing a sport.");
  }
}
class Cricket extends Sports {
  void rules() {
      System.out.println("Cricket has 11 players per team.");
  }
}
class Football extends Sports {
  void rules() {
      System.out.println("Football has 11 players and 2 goals.");
  }
}
public class inher7 {
  public static void main(String[] args) {
    Cricket c = new Cricket();
    c.play();
    c.rules();
    
    Football f = new Football();
    f.play();
    f.rules();
}
}
