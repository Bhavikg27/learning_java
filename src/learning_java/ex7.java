package learning_java;

import java.util.*;

class Book {
    private String name;
    private String author;
    private String issuedTo;
    private Date issuedOn;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.issuedTo = null;
        this.issuedOn = null;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return issuedTo == null;
    }

    public void issueBook(String userName) {
        this.issuedTo = userName;
        this.issuedOn = new Date();
    }

    public void returnBook() {
        this.issuedTo = null;
        this.issuedOn = null;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", issuedTo='" + issuedTo + '\'' +
                ", issuedOn=" + issuedOn +
                '}';
    }
}

class Library {
    private Map<String, Book> books;
    private Set<String> users;

    public Library() {
        books = new HashMap<>();
        users = new HashSet<>();
    }

    public void addUser(String userName) {
        users.add(userName);
        System.out.println("User " + userName + " added to the system.");
    }

    public void addBook(Book book) {
        books.put(book.getName(), book);
        System.out.println("Book " + book.getName() + " added to the library.");
    }

    public void issueBook(String bookName, String userName) {
        if (!users.contains(userName)) {
            System.out.println("User not found in the system.");
            return;
        }
        Book book = books.get(bookName);
        if (book != null && book.isAvailable()) {
            book.issueBook(userName);
            System.out.println("Book " + bookName + " issued to " + userName + ".");
        } else {
            System.out.println("Book is either not available or already issued.");
        }
    }

    public void returnBook(String bookName) {
        Book book = books.get(bookName);
        if (book != null && !book.isAvailable()) {
            book.returnBook();
            System.out.println("Book " + bookName + " returned to the library.");
        } else {
            System.out.println("Book is not issued or doesn't exist.");
        }
    }

    public void showAvailableBooks() {
        System.out.println("Available books in the library:");
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public void showIssuedBooks() {
        System.out.println("Issued books:");
        for (Book book : books.values()) {
            if (!book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
}

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add User");
            System.out.println("2. Add Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show Available Books");
            System.out.println("6. Show Issued Books");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    library.addUser(userName);
                }
                case 2 -> {
                    System.out.print("Enter book name: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Book book = new Book(bookName, author);
                    library.addBook(book);
                }
                case 3 -> {
                    System.out.print("Enter book name to issue: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    library.issueBook(bookName, userName);
                }
                case 4 -> {
                    System.out.print("Enter book name to return: ");
                    String bookName = scanner.nextLine();
                    library.returnBook(bookName);
                }
                case 5 -> library.showAvailableBooks();
                case 6 -> library.showIssuedBooks();
                case 7 -> running = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Exiting program. Thank you!");
        scanner.close();
    }
}
