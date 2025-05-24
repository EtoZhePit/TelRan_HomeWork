package telran.book.model;

public class Magazine {
    private long ISSN;
    private String title;
    private String publisher;
    private int yearOfPublishing;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Magazine(long ISSN, String title, String publisher, int yearOfPublishing) {
        this.ISSN = ISSN;
        this.title = title;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void printM() {
        System.out.println("ISSN: " + ISSN + " Title: " + title + " Publisher: " + publisher + " Year: " + yearOfPublishing);
    }
}
