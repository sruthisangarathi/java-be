class prep{
  private int[] locationCells;
  private int numOfHits;
  public void setLocationCells(int[] loc) {
    locationCells = loc;
}
  public String checkYourself(int userGuess){
    String result="miss";
    for(int cell:locationCells){
    if (userGuess == cell) {
      numOfHits++;
    }else if(numOfHits==locationCells.length){
      return "hit";
    }
      if(userGuess==3){
        return "kill";
        }
        return result;
    }
    return result;
  }
  }
  public class prepcode{
public static void main(String[] args){
   prep p=new prep();
  int[] locs={2,3,4};
        p.setLocationCells(locs);
        System.out.println(p.checkYourself(2)); 
        System.out.println(p.checkYourself(3)); 
        System.out.println(p.checkYourself(5)); 
        System.out.println(p.checkYourself(4)); 
    }
  }


