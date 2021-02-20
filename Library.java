/**
 * A library of books
 * @author Sophie Crane
 */
import java.util.HashMap;
public class Library {
    private HashMap<String, Integer> books = new HashMap<String, Integer>();
    private static Library library;

    /**
     * Creates an instance of a library
     */
    private Library() {}

    /**
     * Creates an instance of a library
     * @return A library of books
     */
    public static Library getInstance() {
        if (library == null) {
            System.out.println("Creating our Library. Time to begin reading.");
            library = new Library();
        }
        return library;
    }

    /**
     * Checks out a book from the library
     * @param bookName Name of the book to be checked out
     * @return A boolean that indicates if the book is in the library or not
     */
    public boolean checkoutBook(String bookName) {
        if(books.containsKey(bookName) && books.get(bookName) > 0)
        {
            books.put(bookName, books.get(bookName) - 1);
            System.out.println(bookName + " was successfully checked out.");
            return true;
        } else {
            System.out.println("Sorry, " + bookName + " is not in stock.");
            return false;
        }
    }

    /**
     * Checks in a book to the library
     * @param bookName Name of the book to be checked out of the library
     * @param numToAdd The number of books to be added to the library
     */
    public void checkInBook(String bookName, int numToAdd) {
        if(books.containsKey(bookName)) {
            books.put(bookName, books.get(bookName) + numToAdd);
        } else {
            books.put(bookName, numToAdd);
            System.out.println("A new copy of " + bookName + " was added to the library.");
        }
    }

    /**
     * Displays the books in the library to the user
     */
    public void displayBooks() {
        System.out.println("Inventory: ");
        for (String i : books.keySet()) {
            System.out.println(" - " + i + ", copies: " + books.get(i));
        }
    }
}