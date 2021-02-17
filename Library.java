
import java.util.*;
public class Library {
    private HashMap<String, Integer> books;
    private static Library library;

    private Library() {}

    public static Library getInstance() {
        if (library == null) {
            System.out.println("Creating our Library. Time to begin reading.");
            library = new Library();
        }
        return library;
    }

    public boolean checkoutBook(String bookName) {
        int previousValue = books.value(bookName);
        if(previousValue > 0) {
            previousValue -= 1;
        }
        books.put(bookName, previousValue);
    }

    public void checkInBook(String bookName, int numToAdd) {
        books.put(bookName, numToAdd);
    }

    public void displayBooks() {
        int previousValue = books.
    }
}