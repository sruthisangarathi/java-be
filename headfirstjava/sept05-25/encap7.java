import java.util.Scanner;

class LibraryBook {
    private String title;
    private boolean isIssued;

    public LibraryBook(String title) {
        this.title = title;
        this.isIssued = false; 
    }
    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book '" + title + "' has been issued.");
        } else {
            System.out.println("Book '" + title + "' is already issued.");
        }
    }
    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book '" + title + "' has been returned.");
        } else {
            System.out.println("Book '" + title + "' was not returned.");
        }
    }

    public boolean isAvailable() {
        return !isIssued;
    }

    public String getTitle() {
        return title;
    }
}

public class encap7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LibraryBook book = new LibraryBook("Head First Java");

    int choice;
    do {
        System.out.println("Library Menu:");
        System.out.println("1. Check Availability");
        System.out.println("2. Issue Book");
        System.out.println("3. Return Book");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                if (book.isAvailable()) {
                    System.out.println("Book '" + book.getTitle() + "' is available.");
                } else {
                    System.out.println("Book '" + book.getTitle() + "' is already issued.");
                }
                break;
            case 2:
                book.issueBook();
                break;
            case 3:
                book.returnBook();
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice, try again.");
        }
    } while (choice != 4);

    sc.close();
}
}


