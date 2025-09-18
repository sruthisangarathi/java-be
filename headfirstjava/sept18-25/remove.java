

public class remove {
  public static void main(String[] args){
    String s="  Java programming     ";
    String res = "";
System.out.println(s.trim());
System.out.println(s.replace(" ",""));
System.out.println(s.replaceAll("\\s",""));
System.out.println(res.isEmpty());
//removing duplicates
for (int i = 0; i < s.length(); i++) {
    String c = String.valueOf(s.charAt(i));
    if (!res.contains(c)) {
        res += c;  
    }
}
System.out.println(res); 

  }
}
