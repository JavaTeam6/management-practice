package org.myteam6;

public class BookController {

    private Library library;
    private BookView view;

    public BookController() {
        library = new Library();
        view = new BookView();
    }

    public void addBook(String title, String author, int isbn, boolean isForeignBook) {

        Book book = new Book(title, author, isbn, isForeignBook);

        library.addBook(book);

        view.displayMessage("도서가 추가되었습니다.");
    }

    public void getBook(int isbn) {

        Book book = library.getBook(isbn);

        if (book != null) {
            view.displayBook(book);
        } else {
            view.displayMessage("도서를 찾을 수 없습니다.");
        }
    }

    public void updateBook(int isbn, String title, String author) {

        library.updateBook(isbn, title, author);

        view.displayMessage("도서가 수정되었습니다.");
    }

    public void deleteBook(int isbn) {

        library.deleteBook(isbn);

        view.displayMessage("도서가 삭제되었습니다.");
    }

    public void displayAllBooks() {

        view.displayBookList(library.getAllBooks());
    }
}
