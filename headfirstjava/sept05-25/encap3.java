// read-only for price-only getter
class Book{
  private String title;
  private String author;
  private double price;

  public String getTitle() {
    return title;
}
public String getAuthor() {
    return author;
}
public double getPrice() {
    return price;   
}
public void setTitle(String title) {
    this.title = title;
}
public void setAuthor(String author) {
    this.author = author;
}

  public Book(String title, String author, double price){ 
    this.title = title;
    this.author = author;
    this.price = price;
}
}

public class encap3 {
  public static void main(String[] args){
    Book b = new Book("HeadFirstJava","Kathy Sierra",450.00);
    System.out.println("Book price is: "+b.getPrice());
    System.out.println("Book title is: "+b.getTitle());
    System.out.println("Book author is: "+b.getAuthor());
  }
}
