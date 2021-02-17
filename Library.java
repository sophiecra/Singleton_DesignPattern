
import java.util.*;
public class Library {
    private HashMap<String, Integer> books;
    private static Library library;

    private Library() {}

    public static Library getInstance() {
        if (library == null) {
            System.out.println("Creating a library. Time to begin reading.");
            library = new Library();
        }
        return library;
    }

    public boolean checkoutBook(String bookName) {

    }

    public void checkInBook(String bookName, int numToAdd) {
        int previousValue = books.get(numToAdd);
        if (books.get(bookName) != null) {
            books.put(bookName, numToAdd);
        }  else {
            previousValue = 0;
            books.put(bookName, numToAdd);
        }
    }

    public void displayBooks() {

    }
}