package telran.book.model;

public class Newspaper {
    private String title;
    private long ISSN;
    private String publisher;
    private int yearOfPublishing;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getISSN() {
        return ISSN;
    }

    public void setISSN(long ISSN) {
        if (String.valueOf(ISSN).length() == 8) {
            this.ISSN = ISSN;
        } else {
            System.out.println("Invalid ISSN");
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public Newspaper(String title, long ISSN, String publisher, int yearOfPublishing) {
        this.title = title;
        this.ISSN = ISSN;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
    }
    public void printN() {
        System.out.println("ISSN: " + ISSN + " Title: " + title + " Publisher: " + publisher + " Year: " + yearOfPublishing);
    }
}
