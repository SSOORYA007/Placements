class libraryBook {
    int bookId;
    String title;
    String author;
    boolean isIssued = false;

    void returnBook() {
        if (isIssued == true) {
            isIssued = false;
            System.out.println("Book returned Sucessfully !");
        } else {
            System.out.println("Book was not issued ");
        }
    }

    void issueBook() {
        if (isIssued == false) {
            isIssued = true;
            System.out.println("Book issued Sucessfully !");
        } else {
            System.out.println("Book was not issued ");
        }
    }

    void displayBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Is Issued: " + isIssued);
    }
}

public class library {
    public static void main(String[] args) {
        libraryBook book = new libraryBook();
        book.bookId = 1;
        book.title = "Java Programming";
        book.author = "John Doe";
        book.displayBookInfo();
        book.issueBook();
        book.returnBook();
    }
}
