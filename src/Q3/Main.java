package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BookShelf<String> bookShelf= new BookShelf<>();
        BookStack<Integer> bookStack = new BookStack<>();

        System.out.println("도서 정보를 입력하세요.");
        System.out.println("제목: ");
        String title = sc.nextLine();

        System.out.println("저자: ");
        String author = sc.nextLine();

        System.out.println("문자열 식별자: ");
        String BookShelfIdentifier = sc.nextLine();

        System.out.println("정수형 식별자: ");
        Integer StackIdentifier = sc.nextInt();
        sc.nextLine();

        Book<String> shelfBook = new Book<>(title, author, BookShelfIdentifier);
        Book<Integer> stackBook = new Book<>(title, author, StackIdentifier);

        bookShelf.addBook(shelfBook);
        bookStack.pushBook(stackBook);

        System.out.println("제목으로 도서 검색 결과");
        for(Book<String> searchTitleResult : bookShelf.searchByTitle(title)){
            System.out.println(
                    "제목 : " + searchTitleResult.getTitle()
                    + ", 저자 : " + searchTitleResult.getAuthor()
                    + ", 식별자 : " + searchTitleResult.getIdentifier()
            );
        }
        System.out.println("======================");

        System.out.println("저자로 도서 검색 결과");
        for(Book<String> searchTitleResult : bookShelf.searchByAuthor(author)){
            System.out.println(
                    "제목 : " + searchTitleResult.getTitle()
                            + ", 저자 : " + searchTitleResult.getAuthor()
                            + ", 식별자 : " + searchTitleResult.getIdentifier()
            );
        }
        System.out.println("======================");

        System.out.println("책을 꺼내겠습니까?");

        sc.close();
    }
}
