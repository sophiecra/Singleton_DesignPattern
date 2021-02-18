
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
        int numCopies = books.get(bookName);
        if(numCopies > 0)
        {
            numCopies -= 1;
            books.put(bookName, numCopies);
            return true;
        } else {
            return false;
        }
    }

    public void checkInBook(String bookName, int numToAdd) {
        int numCopies = numToAdd + books.get(bookName);
        books.put(bookName, numCopies);
    }

    public void displayBooks() {
        Iterator bookIterator = books.entrySet().iterator();
        System.out.println("Inventory: ");
        while(bookIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)bookIterator.next();
            int numCopies = ((int)mapElement.getValue());
            System.out.println("- " + mapElement.getKey() + ": " + numCopies);
        }
    }
}