package Q3;

import java.util.List;

public interface BookManager<T> {
    abstract void addBook(Book<T> book);
    abstract void removeBook(Book<T> book);
    abstract List<Book<T>> searchByTitle(String title);
    List<Book<T>> searchByAuthor(String author);
}
