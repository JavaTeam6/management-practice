package org.myteam6;

import java.util.List;

public class BookView {

    public void displayBook(Book book) {

        System.out.println(book);
    }

    public void displayBookList(List<Book> books) {

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayMessage(String message) {

        System.out.println(message);
    }
}
