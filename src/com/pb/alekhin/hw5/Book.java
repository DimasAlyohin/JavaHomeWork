package com.pb.alekhin.hw5;

public class Book {

    private String bookTitle;
    private String bookAuthor;
    private int yearPublishing;


    // public Book(String bookTitle) {
        // this.bookTitle = bookTitle;}

    public Book(String bookTitle, String bookAuthor, int yearPublishing) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearPublishing = yearPublishing;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    String getInfo() {
        return bookTitle + " (" + bookAuthor + ", " + yearPublishing + ")";
    }
}
