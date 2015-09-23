package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by lsantano on 9/22/15.
 */
public class Library {

    private ArrayList<Book> books;
    private PrintStream printStream;

    public Library(ArrayList<Book> books, PrintStream printStream){
        this.books = books;
        this.printStream = printStream;
    }

    public void showBooks() {
        String bookList = "";
        for(Book item:books){
            bookList+=(item.bookOutput() + "\n");
        }
        printStream.println(bookList);
    }
}
