package learning_java;

class library{
    String[] IssuedBooks;
    String[] books;
    int no_of_books;
    int no_of_IssuedBooks;
    library(){
        this.books= new String[100];
        this.IssuedBooks =new String[100];
        this.no_of_books=0;
        this.no_of_IssuedBooks =0;
    }
    void AddBook(String book){
        this.books[no_of_books]=book;
        System.out.println(book+" has been added.");
        no_of_books++;
    }
    void ShowAvailableBooks(){
        System.out.println("available books are - ");
        for (String book:this.books) {
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void TotalNoOfBooks(){
        int count = 0;
        for (String book : books) {
            if (book != null) {
                count++;
            }
        }
        System.out.println(count);
    }
    void IssueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                continue;
            } else if (this.books[i].equalsIgnoreCase(book)) {
                this.books[i] = null;
                // Check if the slot in IssuedBooks is null before assigning
                for (int j = 0; j < this.IssuedBooks.length; j++) {
                    if (this.IssuedBooks[j] == null) {
                        this.IssuedBooks[j] = book;
                        break;
                    }
                }
                System.out.println(book + " has been issued");
                no_of_IssuedBooks++;
                return;
            }
        }
        System.out.println("This book is currently not in the library");
    }
    void ReturnBook(String book) {
        System.out.println(book + " has been returned.");
        for (int i = 0; i < this.IssuedBooks.length; i++) {
            if (this.IssuedBooks[i] == null) {
                continue;
            }
            if (this.IssuedBooks[i].equalsIgnoreCase(book)) {
                this.IssuedBooks[i] = null;
                this.books[no_of_books] = book.toUpperCase();
                no_of_books++;
                return;
            }
        }
        System.out.println("This book was not issued from the library");
    }
    void ShowIssuedBooks(){
        System.out.println("issued books are - ");
        for (String book:this.IssuedBooks) {
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
}
public class exercise_4 {
    public static void main(String[] args) {
        library central_library =new library();

        central_library.AddBook("harry potter");
        central_library.AddBook("IRON MAN");
        central_library.AddBook("IRON MAN2");
        central_library.AddBook("IRON MAN3");
        central_library.AddBook("IRON MAN4");
        central_library.ShowAvailableBooks();
        central_library.TotalNoOfBooks();
        central_library.IssueBook("iron man2");
        central_library.IssueBook("iron man4");
        central_library.ShowAvailableBooks();
        central_library.ShowIssuedBooks();
        central_library.ReturnBook("iron man2");
        central_library.ReturnBook("iron man4");
        central_library.ShowAvailableBooks();
        central_library.ShowIssuedBooks();
    }
}
