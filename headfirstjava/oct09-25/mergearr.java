import java.util.Arrays;

public class mergearr {
  public static void main(String[] args){
    String[] arr1={"chai","coffee"};
    String[] arr2={"milk","water","coke"};
    String[] merge=new String[arr1.length + arr2.length];
    for(int i=0;i<arr1.length;i++){
      merge[i]=arr1[i];
    }
      for(int i=0;i<arr2.length;i++){
        merge[arr1.length+i]=arr2[i];
    }
    System.out.println(Arrays.toString(merge));
  }
}
 