package learning_java.learning_java;

import java.util.*;
class library{
    String[] issuedbooks;
    String[] books;
    int no_of_books;
    int no_of_issuedbooks;
    library(){
        this.books= new String[100];
        this.issuedbooks=new String[100];
        this.no_of_books=0;
        this.no_of_issuedbooks=0;
    }
    void AddBook(String book){
        this.books[no_of_books]=book;
        System.out.println(book+" has been added.");
        no_of_books++;
    }
    void showavailablebooks(){
        System.out.println("available books are - ");
        for (String book:this.books) {
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void totalnoofbboks(){
        int count = 0;
        for (String book : books) {
            if (book != null) {
                count++;
            }
        }
        System.out.println(count);
    }
    void issuebook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                continue;
            } else if (this.books[i].equalsIgnoreCase(book)) {
                this.books[i] = null;
                // Check if the slot in issuedbooks is null before assigning
                for (int j = 0; j < this.issuedbooks.length; j++) {
                    if (this.issuedbooks[j] == null) {
                        this.issuedbooks[j] = book;
                        break;
                    }
                }
                System.out.println(book + " has been issued");
                no_of_issuedbooks++;
                return;
            }
        }
        System.out.println("This book is currently not in the library");
    }
    void returnbook(String book) {
        System.out.println(book + " has been returned.");
        for (int i = 0; i < this.issuedbooks.length; i++) {
            if (this.issuedbooks[i] == null) {
                continue;
            }
            if (this.issuedbooks[i].equalsIgnoreCase(book)) {
                this.issuedbooks[i] = null;
                this.books[no_of_books] = book.toUpperCase();
                no_of_books++;
                return;
            }
        }
        System.out.println("This book was not issued from the library");
    }
    void showissuedbooks(){
        System.out.println("issued books are - ");
        for (String book:this.issuedbooks) {
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
        central_library.showavailablebooks();
        central_library.totalnoofbboks();
        central_library.issuebook("iron man2");
        central_library.issuebook("iron man4");
        central_library.showavailablebooks();
        central_library.showissuedbooks();
        central_library.returnbook("iron man2");
        central_library.returnbook("iron man4");
        central_library.showavailablebooks();
        central_library.showissuedbooks();
    }
}