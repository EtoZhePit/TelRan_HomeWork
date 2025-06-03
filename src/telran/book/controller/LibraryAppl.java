package telran.book.controller;

import telran.book.dao.Library;
import telran.book.model.Book;

public class LibraryAppl {
    public static void main(String[] args) {
//        Book book1 = new Book(9_999_999_999l, "Book1", 2000);
//        Library library = new Library(7);
//        System.out.println((library.addBook(book1)));
//        System.out.println((library.addBook(book1)));
//        System.out.println((library.addBook(book1)));
//        System.out.println((library.addBook(book1)));
//        System.out.println((library.addBook(book1)));
//        System.out.println((library.addBook(book1)));
//        System.out.println((library.addBook(book1)));
//        System.out.println((library.addBook(book1)));
//        library.printBooks();
//        System.out.println("Size of library = " + library.getSize());

        Library library = new Library(8);
        library.addBook(new Book(1000000000000L,"Book1",1977));
        library.addBook(new Book(2000000000000L,"Book2", "Author1",1998));
        library.addBook(new Book(3000000000000L,"Book3", "Author2",2012));
        library.addBook(new Book(4000000000000L,"Book4", "Author1",1980));
        library.addBook(new Book(5000000000000L,"Book5", "Author3",1995));
//        library.printBooks();
//        System.out.println("===================");
//        System.out.println("Find Book " + library.findBookByTitle("Book3"));
//        System.out.println("Remove Book " +library.removeBookByTitle("Book3"));
//        library.printBooks();
//        System.out.println("====================");
//        System.out.println("Updated: " + library.updateBook("unknown", "author42"));
//        System.out.println("====================");
//        library.printBooks();

        // homework

        library.printBooks();
        System.out.println("===================");
        library.printBooks(1980);
        System.out.println("===================");
        library.printBooks(1980, 2000);
        System.out.println("===================");
        library.findIndexofBookByTitle("Book3");




    }
}
