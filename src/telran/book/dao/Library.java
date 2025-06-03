package telran.book.dao;

import telran.book.model.Book;

public class Library {
    Book[] books;
    int size;

    public Library(int capacity) {
        books = new Book[capacity];
    }

    public boolean addBook(Book book) {
        if (books.length == size) {
            return false;
        }
        books[size] = book;
        size++;
        return true;
    }

    public Book removeBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                Book victim = books[i];
                books[i] = books[size - 1]; // последнее значение
                books[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book updateBook(String author, String newAuthor){ //опцинальное дз - сделать перегруз updateBook в неск. вариантах
        for (int i = 0; i <size ; i++) {
            if (books[i].getAuthor().equals(author)){
                books[i].setAuthor(newAuthor);
                return books[i];
            }
        }
        return null;
    }

    public void printBooks() {
        for (int i = 0; i <size; i++) {
            System.out.println(books[i]);
        }
    }

    public int getSize() {
        return size;
    }

    public void printBooks(int fromYear){
        for (int i = 0; i < size ; i++) {
            if (books[i].getYearOfPublishing() >= fromYear){
                System.out.println(books[i]);
            }
            if (books[i].getYearOfPublishing() <= fromYear){
                continue;
            }
        }

    }
    public void printBooks(int fromYear, int toYear){
        for (int i = 0; i < size ; i++) {
            for (int j = i+1; j < size ; j++) {
                if (books[j].getYearOfPublishing() < books[i].getYearOfPublishing()){
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
        for (int i = 0; i < size ; i++) {
            if (books[i].getYearOfPublishing() >= fromYear && books[i].getYearOfPublishing() <= toYear){
                System.out.println(books[i]);
            }
        }
    }
    public void findIndexofBookByTitle(String title){
        for (int i = 0; i < size ; i++) {
            if (books[i].getTitle().equals(title)){
                System.out.println(i);
            } else {
                System.out.println(-1);
            }
        }
    }
}
