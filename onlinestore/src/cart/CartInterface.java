package cart;

import item.Book;
import java.util.ArrayList;

public interface CartInterface {
    void printBookLsit(ArrayList<Book> p);
    boolean isCartInBook(String id);
    void insertBook(Book p);
    void removeCart(int numID);
    void deleteBook();
}
