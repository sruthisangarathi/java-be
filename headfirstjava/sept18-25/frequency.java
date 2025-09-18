

public class frequency {
  public static void main(String[] args){
    String str="banana";
    //char c='b';
    char b='a';
    int freq=0;
    for(int i=0;i<str.length();i++){
      if(b==str.charAt(i)){
        ++freq;
      }
      
    }
System.out.println(freq);
  }
}
