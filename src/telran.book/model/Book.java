package telran.book.model;

public class Book {
    // long isbn (checkISBN() - 13 digits), String title, String author, (int) yearOfPublishing or String
    private long isbn;
    private String title;
    private String author;
    private int yearOfPublishing;

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        if (String.valueOf(isbn).length() == 13) {
            this.isbn = isbn;
        } else {
            System.out.println("Invalid ISBN");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void printB() {
        System.out.println("Title: " + title + " Author: " + author + " Year: " + yearOfPublishing + " ISBN: " + isbn);
    }

}
