//phrase-o-matic

public class phraseo {
  public static void main(String[] args){
    String[] word1={"hi","hello","hola","think","first","words"};
    String[] word2={"i","am","the","second","word"};
    String[] word3={"she","is","third","alphabet"};

    // int oneLen=word1.length;
    // int twoLen=word2.length;
    // int threeLen=word3.length;

    java.util.Random ranGen=new java.util.Random();
    int ran1=ranGen.nextInt(word1.length);
    int ran2=ranGen.nextInt(word2.length);
    int ran3=ranGen.nextInt(word3.length);

    String phrase=word1[ran1]+" "+word2[ran2]+" "+word3[ran3];
    System.out.println("What we need is:" +phrase);


  }
}
