class Book{
  String title, author;
  double price;
  Book(String title){
    this.title=title;
  }
  Book(String title, String author){
    this.title=title;
    this.author=author;
  }
  Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
}
void display() {
  System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
}
}

public class poly6 {
  public static void main(String[] args){
    Book b1=new Book("Head First Java");
    Book b2=new Book("Java Programming","James");
    Book b3=new Book("Java","Gosling",420);
    b1.display();
    b2.display();
    b3.display();


  }
}
