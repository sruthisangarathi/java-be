class Game{
int [] locationCells;
int numOfHits;

public void setLocationCells(int[] locs) {
  locationCells = locs;
  }
  public String checkYourself(int guess) {
  String result = "miss";
  for (int cell : locationCells) {
  if (guess == cell) {
  result = "hit";
  numOfHits++;
  break;
 
  } 
  } 
  if (numOfHits ==locationCells.length) { 
  result = "kill";
  } 
  System.out.println(result); 
  return result;
}
public class simpleStartup {

public static void main(String[] args){
  Game g = new Game();
  int[] locations = {2, 3, 4};
  g.setLocationCells(locations);
  int userGuess = 2;
 String result = g.checkYourself(userGuess);
String testResult = "failed";
if (result.equals("hit")) {
testResult = "passed";
}
System.out.println(testResult);
  
}
}
}

