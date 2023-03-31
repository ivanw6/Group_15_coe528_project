package FinalProject;

import java.util.ArrayList;

/**
 *
 * @author ivanu
 */
public class Owner {

    private static final ArrayList<Customer> customers = new ArrayList<>();
    private static final ArrayList<Book> books = new ArrayList<>();

    public String getUsername() {
        return "admin";
    }

    public String getPassword() {
        return "admin";
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    public void addCustomer(Customer created) {
        customers.add(created);
    }

    public void deleteCustomer(Customer selected) {
        customers.remove(selected);
    }
}
