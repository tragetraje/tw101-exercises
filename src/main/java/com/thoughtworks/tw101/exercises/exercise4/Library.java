package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {

        for (int i = 0; i < this.books.length; i++) {
            String[] bookNameAsArray = this.splitName(this.books[i]);

            if (this.hasPartialBookTitle(bookNameAsArray, partialBookTitle)) {
                System.out.println("Books containing word " + partialBookTitle + ':');
                this.printStream.print(this.books[i]);
                System.out.println();
            }
        }
    }

    public String[] splitName(String bookName) {
        return bookName.split("\\s+");
    }

    public boolean hasPartialBookTitle(String[] bookTitle, String partial) {

        for (int j=0; j < bookTitle.length; j++) {

            if (bookTitle[j].equals(partial)) {
                return true;
            }
        }
        return false;
    }
}
