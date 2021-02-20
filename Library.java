
import java.util.HashMap;
public class Library {
    private HashMap<String, Integer> books = new HashMap<String, Integer>();
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

    public void checkInBook(String bookName, int numToAdd) {
        if(books.containsKey(bookName)) {
            books.put(bookName, books.get(bookName) + numToAdd);
        } else {
            books.put(bookName, numToAdd);
            System.out.println(bookName + " was added to the library.");
        }
    }

    public void displayBooks() {
        Iterator bookIterator = books.entrySet().iterator();
        System.out.println("Inventory: ");
        for(String i : books.keySet()) {
            System.out.println("Title: " + i + " Copies: " + books.get(i));
        }
}