import java.util.*;

// Book Class
class Book {
    private final int id;
    private final String title;
    private final String author;
    private boolean isBorrowed;

    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }


    public boolean borrowBook(){
        if(!isBorrowed){
            isBorrowed = true;
            return true;
        }
        return false;
    }

    public void returnBook(){
        isBorrowed = false;
    }


    public boolean isBorrowed(){
        return isBorrowed;
    }


    @Override
    public String toString(){
        return id + ": " + title + " by " + author + (isBorrowed ? " [Borrowed]" : "");
    }
}


// User Class
class User {
    private final int id;
    private final String name;
    private final List<Book> borrowedBooks;

    public User(int id, String name){
        this.id = id;
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }


    public void borrowBook(Book book){
        if(book.borrowBook()){
            borrowedBooks.add(book);
            System.out.println(name + " borrowed \"" + book + "\"");
        } else {
            System.out.println("Sorry, \"" + book + "\" is already borrowed.");
        }
    }


    public void returnBook(Book book){
        if(borrowedBooks.contains(book)){
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned \"" + book + "\"");
        } else {
            System.out.println(name + " did not borrow \"" + book + "\"");
        }
    }


    @Override
    public String toString(){
        return id + ": " + name + " (Borrowed Books: " + borrowedBooks.size() + ")";
    }
}


// Library Class
class Library {
    final List<Book> books;
    private final List<User> users;

    public Library(){
        books = new ArrayList<>();
        users = new ArrayList<>();
    }


    public void addBook(Book book){
        books.add(book);
    }


    public void addUser(User user){
        users.add(user);
    }

    public void showBooks(){
        System.out.println("Library Books:");
        for(Book book : books){
            System.out.println(book);
        }
    }
    

    public void showUsers(){
        System.out.println("Library Users:");
        for(User user : users){
            System.out.println(user);
        }
    }
}


// Main Class
public class libratyManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books
        library.addBook(new Book(1, "The Alchemist", "Paulo Coelho"));
        library.addBook(new Book(2, "1984", "George Orwell"));
        library.addBook(new Book(3, "Java Programming", "Joy"));

        // Add some users
        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");

        library.addUser(user1);
        library.addUser(user2);

        library.showBooks();
        library.showUsers();

        System.out.println("\n--- Borrowing Books ---");
        user1.borrowBook(library.books.get(0));
        user2.borrowBook(library.books.get(0));

        System.out.println("\n--- Returning Books ---");
        user1.returnBook(library.books.get(0));
        user2.borrowBook(library.books.get(0));

        System.out.println("\n--- Final Status ---");
        library.showBooks();
        library.showUsers();
    }
}
