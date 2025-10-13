

public class indexarr {
 public static void main(String[] args){
//   int[] arr={2,5,3,9,7};
//   int max=arr[0], index=0;
//   for(int i=0;i<arr.length;i++){
// if(max<arr[i]){
//   max=arr[i];
//   index=i;
// }}
// System.out.println(max);
// System.out.println(index);

String[] arr={"chai","coffee","milk","tea","water"};
String max=arr[0];
int index=0;
for(int i=0;i<arr.length;i++){
  if(arr[i].compareTo(max)<0){
    arr[i]=max;
index=i;
  }
}
System.out.println(max);
System.out.println(index);
}
 } 

