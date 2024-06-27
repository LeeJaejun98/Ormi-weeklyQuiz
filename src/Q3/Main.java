package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookShelf<String> bookShelf = new BookShelf<>();
        BookStack<Integer> bookStack = new BookStack<>();

        System.out.println("책 정보를 입력하세요.");
        System.out.println("제목: ");
        String title = sc.nextLine();

        System.out.println("저자: ");
        String author = sc.nextLine();

        System.out.println("문자열 식별자: ");
        String BookShelfIdentifier = sc.nextLine();

        System.out.println("정수형 식별자: ");
        Integer StackIdentifier = sc.nextInt();
        sc.nextLine();
        System.out.println("======================");

        Book<String> shelfBook = new Book<>(title, author, BookShelfIdentifier);
        Book<Integer> stackBook = new Book<>(title, author, StackIdentifier);

        bookShelf.addBook(shelfBook);
        bookStack.pushBook(stackBook);

        //BookShelf의 메소드들을 통해 제목을 통해 책 정보 보여주기
        System.out.println("제목으로 책 검색 결과");
        for (Book<String> searchTitleResult : bookShelf.searchByTitle(title)) {
            System.out.println(
                    "제목 : " + searchTitleResult.getTitle()
                            + ", 저자 : " + searchTitleResult.getAuthor()
                            + ", 식별자 : " + searchTitleResult.getIdentifier()
            );
        }
        System.out.println("======================");

        //BookShelf의 메소드들을 통해 저자를 통해 책 정보 보여주기
        System.out.println("저자로 책 검색 결과");
        for (Book<String> searchTitleResult : bookShelf.searchByAuthor(author)) {
            System.out.println(
                    "제목 : " + searchTitleResult.getTitle() +
                            ", 저자 : " + searchTitleResult.getAuthor()
                            + ", 식별자 : " + searchTitleResult.getIdentifier()
            );
        }
        System.out.println("======================");

        //bookStack의 pop을 통해 책을 꺼내 정보 보여주기
        System.out.println(" 꺼낸 책 정보 ");
        Book<Integer> poppedBook = bookStack.popBook();
        System.out.println(
                "제목 : " + poppedBook.getTitle() +
                    ", 저자 : " + poppedBook.getAuthor() +
                    ", 식별자 : " + poppedBook.getIdentifier()
        );
        System.out.println("======================");

        // bookStack isEmpty 메소드 통해 보여주기
        System.out.println("책 스택이 비어있나요?");
        System.out.println(bookStack.isEmpty());

        //bookStack의 peek 함수 사용해 최상단 정보 보여주기
        System.out.println(" 최상단 책 정보 ");
        Book<Integer> peekedBook = bookStack.peekBook();
        System.out.println(
                "제목 : " + peekedBook.getTitle() +
                        ", 저자 : " + peekedBook.getAuthor() +
                        ", 식별자 : " + peekedBook.getIdentifier()
        );

        sc.close();
    }
}
