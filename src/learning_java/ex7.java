package learning_java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Book {
    private String name;
    private String author;
    private boolean isIssued;
    private String issuedTo;
    private String issuedOn;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.isIssued = false;
        this.issuedTo = null;
        this.issuedOn = null;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook(String userName, String date) {
        this.isIssued = true;
        this.issuedTo = userName;
        this.issuedOn = date;
    }

    public void returnBook() {
        this.isIssued = false;
        this.issuedTo = null;
        this.issuedOn = null;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public String getIssuedOn() {
        return issuedOn;
    }

    @Override
    public String toString() {
        return "Book Name: " + name + ", Author: " + author + (isIssued ? ", Issued to: " + issuedTo + ", Issued on: " + issuedOn : ", Available");
    }
}

class Library {
    private Map<Integer, library_Account> accounts;
    private List<Book> books;

    public Library() {
        accounts = new HashMap<>();
        books = new ArrayList<>();
    }

    /**
     *
     * @param account account number of the user
     */
    public void addAccount(library_Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    /**
     *
     * @param accountNumber account number of the user
     * @return returning account number of the user
     */
    public library_Account findAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public void displayAllAccounts() {
        System.out.println("All User Accounts:");
        for (library_Account account : accounts.values()) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Name: " + account.getUserName());
        }
    }

    /**
     *
     * @param book name of the book
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getName() + " by " + book.getAuthor());
    }

    /**
     *
     * @param bookName name of the book
     * @return returning the book name
     */
    public Book findBook(String bookName) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(bookName) && !book.isIssued()) {
                return book;
            }
        }
        return null;
    }

    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book);
            }
        }
    }

    public void showIssuedBooks() {
        System.out.println("Issued Books:");
        for (Book book : books) {
            if (book.isIssued()) {
                System.out.println(book);
            }
        }
    }
}

class library_Account {
    private int accountNumber;
    private String userName;
    private List<Book> issuedBooks;

    /**
     *
     * @param accountNumber this is the user account number
     * @param userName this is the username
     */
    public library_Account(int accountNumber, String userName) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.issuedBooks = new ArrayList<>();
    }

    /**
     *
     * @return returning the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @return returning the username
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param book name of the book being issued
     */
    public void issueBook(Book book) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = now.format(formatter);

        book.issueBook(userName, formattedDate);
        issuedBooks.add(book);
        System.out.println("Book issued: " + book.getName() + " to " + userName + " on " + formattedDate);
    }

    /**
     *
     * @param book name of the book being issued
     */
    public void returnBook(Book book) {
        book.returnBook();
        issuedBooks.remove(book);
        System.out.println("Book returned: " + book.getName() + " by " + userName);
    }

    public void showIssuedBooks() {
        System.out.println("Books issued to " + userName + ":");
        for (Book book : issuedBooks) {
            System.out.println(book);
        }
    }
}

/**
 * Generating java doc for the class
 *
 * @author Bhavik Gupta
 * @version 0.24
 * @see <a href=https://docs.oracle.com/en/java/javase/22/docs/api/index.html>java Docs</a>
 * @since 2023
 */

public class ex7 {
    /**
     *
     * @param args this is the argument given to the main
     */
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to Our Library!");
            System.out.println("1. Create Account");
            System.out.println("2. Add Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show Available Books");
            System.out.println("6. show issued books");
            System.out.println("7. Show all Issued Books");
            System.out.println("8. View All Accounts");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    int accountNumber = (int) (Math.random() * 10000);
                    library_Account account = new library_Account(accountNumber, userName);
                    library.addAccount(account);
                    System.out.println("Account created successfully. Account Number: " + account.getAccountNumber());
                }
                case 2 -> {
                    System.out.print("Enter book name: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String authorName = scanner.nextLine();
                    Book book = new Book(bookName, authorName);
                    library.addBook(book);
                }
                case 3 -> {
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library_Account account = library.findAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter book name to issue: ");
                        String bookName = scanner.nextLine();
                        Book book = library.findBook(bookName);
                        if (book != null) {
                            account.issueBook(book);
                        } else {
                            System.out.println("Book not available or already issued.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library_Account account = library.findAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter book name to return: ");
                        String bookName = scanner.nextLine();
                        Book book = library.findBook(bookName); // Look for issued book in user's list
                        if (book != null && book.isIssued()) {
                            account.returnBook(book);
                        } else {
                            System.out.println("This book was not issued from the library.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 5 -> library.showAvailableBooks();
                case 6 -> {
                    System.out.print("Enter account number 1: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library_Account account = library.findAccount(accountNumber);
                    if (account != null) {
                        account.showIssuedBooks();
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 7 -> library.showIssuedBooks();
                case 8 -> library.displayAllAccounts();
                case 9 -> running = false;
                default -> System.out.println("Invalid option.");
            }
            System.out.println();
        }

        System.out.println("Exiting program. Thank you!");
        scanner.close();
    }
}
