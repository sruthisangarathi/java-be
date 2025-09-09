class Travel{
  String name, destination,type;
  int noOfTickets;

  void bookTickets(String name, String destination){
    System.out.println("Name: "+name+" Destination: "+destination);
  }
  void bookTickets(String name,String destination,int noOfTickets){
    System.out.println("Name: "+name+" Destination: "+destination+" NoOfTickets: "+noOfTickets);
  }
 void bookTickets(String name,String destination,int noOfTickets,String type){
  System.out.println("Name: "+name+" Destination: "+destination+" NoOfTickets: "+noOfTickets+" ClaSS Type: "+type);
  }
}
public class poly8 {
  public static void main(String[] args){
    Travel t=new Travel();
    t.bookTickets("sruthi","vizag");
    t.bookTickets("sneha","hyderabad",2);
    t.bookTickets("sravya","banglore",4,"economy");

  }
}
