package telran.book.controller;

import telran.book.model.Book;
import telran.book.model.Comics;
import telran.book.model.Magazine;
import telran.book.model.Newspaper;

import java.util.Arrays;

public class BookAppl {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book(1234567890123L, "Escape from Freedom", "E. Fromm ", 1941);
        library[1] = new Book(9876543210987L, "Day of the Oprichnik", "V. Sorokin", 2006);
        library[2] = new Book(5555555555555L, "Generation 'P'", " V. Pelevin", 1999);
        library[3] = new Book(6234567890123L, "Glue", " I. Welsh ", 2001);
        library[4] = new Book(1234467890123L, "The Stranger", " A. Camus ", 1942);

        Magazine[] magazines = new Magazine[5];

        magazines[0] = new Magazine(12345678L, "National Geographic", "National Geographic Society", 2023);
        magazines[1] = new Magazine(87654321L, "The New Yorker", "Condé Nast", 2022);
        magazines[2] = new Magazine(23456789L, "Scientific American", "Springer Nature", 2021);
        magazines[3] = new Magazine(34567890L, "Time", "Time USA, LLC", 2023);
        magazines[4] = new Magazine(45678901L, "Wired", "Condé Nast", 2024);

        Newspaper[] newspapers = new Newspaper[5];

        newspapers[0] = new Newspaper("The Times", 12345678L, "Times Newspapers Ltd", 2023);
        newspapers[1] = new Newspaper("The Guardian", 23456789L, "Guardian Media Group", 2022);
        newspapers[2] = new Newspaper("The New York Times", 34567890L, "The New York Times Company", 2021);
        newspapers[3] = new Newspaper("Le Monde", 45678901L, "La Vie-Le Monde", 2020);
        newspapers[4] = new Newspaper("Der Spiegel", 56789012L, "Spiegel-Verlag", 2024);

        Comics[] comicsArray = new Comics[5];

        comicsArray[0] = new Comics("Watchmen", "Alan Moore", 1987, 9781401245252L);
        comicsArray[1] = new Comics("The Sandman", "Neil Gaiman", 1989, 9781401284770L);
        comicsArray[2] = new Comics("Maus", "Art Spiegelman", 1991, 9780394747231L);
        comicsArray[3] = new Comics("Batman: The Killing Joke", "Alan Moore", 1988, 9780930289454L);
        comicsArray[4] = new Comics("V for Vendetta", "Alan Moore", 1982, 9781401207922L);


        print(library);
        System.out.println("===========================================");
        print(library, 1970);
        System.out.println("===========================================");
        print(library, 1940, 2005);
        System.out.println("===========================================");
        printM(magazines);
        System.out.println("===========================================");
        printN(newspapers);
        System.out.println("===========================================");
        printС(comicsArray);


        // ToDo create library. три перегруженных метода принт
        // print(Book[]) - print(Book[], fromYear) - print(Book[], fromYear, toYear) - сортировка книг от старых к новым

        //* ToDo store: magazine, newspaper, comics, books.
        // Make the library, but make the unique classes magazine, newspaper, comics.


    }

    private static void printС(Comics[] comicsArray) {
        for (Comics comics : comicsArray) {
            comics.printC();
        }
    }

    private static void printN(Newspaper[] newspapers) {
        for (Newspaper newspaper : newspapers) {
            newspaper.printN();
        }
    }

    private static void printM(Magazine[] magazines) {
        for (Magazine magazine : magazines) {
            magazine.printM();
        }
    }

    public static void print(Book[] library) {
        for (Book book1 : library) {
            book1.printB();
        }
    }

    public static void print(Book[] library, int fromYear) {
        for (Book book1 : library) {
            if (book1.getYearOfPublishing() >= fromYear) {
                book1.printB();
            }
            if (book1.getYearOfPublishing() < fromYear) {
                continue;
            }
        }
    }

    public static void print(Book[] library, int fromYear, int toYear) {
        Book[] sorted = Arrays.copyOf(library, library.length);
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[j].getYearOfPublishing() < sorted[i].getYearOfPublishing()) {
                    Book temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        for (Book book1 : sorted) {
            if (book1.getYearOfPublishing() >= fromYear && book1.getYearOfPublishing() <= toYear) {
                book1.printB();
            }
        }
    }


}
//    public void printB(Book[] books) {
//        for (int i = 0; i < books.length; i++) {
//            int minYear = i;
//
//            for (int j = i + 1; j < books.length; j++) {
//                if (books[j].getYearOfPublishing() < books[minYear].getYearOfPublishing()) {
//                    minYear = j;
//                }
//                int temp = books[i].getYearOfPublishing();
//                books[i].setYearOfPublishing(books[minYear].getYearOfPublishing());
//                books[minYear].setYearOfPublishing(temp);
//            }
//        }
//    }
