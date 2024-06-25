package Q3;

import java.util.List;

public interface BookManager<T> {
    void addBook(Book<T> book);    //책 추가 메소드
    void removeBook(Book<T> book); // 책 삭제 메소드
    List<Book<T>> searchByTitle(String title);   //책 제목으로 검색
    List<Book<T>> searchByAuthor(String author); // 책 저자로 검색
}
