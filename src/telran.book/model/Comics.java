package telran.book.model;

public class Comics {
    private String title;
    private String author;
    private int yearOfPublishing;
    private long isbn;

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

    public Comics(String title, String author, int yearOfPublishing, long isbn) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = isbn;
    }

    public void printC() {
        System.out.println("Title: " + title + " Author: " + author + " Year: " + yearOfPublishing + " ISBN: " + isbn);
    }
}
