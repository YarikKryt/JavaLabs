package com.lab2.main;

import com.lab2.book.Book;

public class Main {
    public static void main(String[] args) {
        Book[] books = createBooks();
        printBooksByAuthor(books, "Б.Матіяш");
        printBooksByPublisher(books, "Кальварія");
        printBooksAfterYear(books, 2016);
    }

    private static Book[] createBooks() {
        return new Book[] {
                new Book(1, "Пісня Пісень", "Б.Матіяш", "Видавництво Старого Лева", 2018, 142, 200.0),
                new Book(2, "Designing Data-Intensive Applications", "Martin Kleppmann", "O'Reilly Media", 2017, 616, 700.0),
                new Book(3, "Жуйка", "М.Козиренко", "Кальварія", 2016, 120, 300.0),
                new Book(4, "Львів - одне велике ліжко : Оповідання про Львів, час і секс", "Author4", "Кальварія", 2017, 112, 250.0),
                new Book(5, "Казки Різдва (обидві частини)", "Б.Матіяш", "Видавництво Старого Лева", 2015, 128, 150.0),
        };
    }

    private static void printBooksByAuthor(Book[] books, String author) {
        System.out.println("Книги за авторства " + author + ":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
        System.out.println();
    }

    private static void printBooksByPublisher(Book[] books, String publisher) {
        System.out.println("Книги від видавництва " + publisher + ":");
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book);
            }
        }
        System.out.println();
    }

    private static void printBooksAfterYear(Book[] books, int year) {
        System.out.println("Книги випущені після " + year + ":");
        for (Book book : books) {
            if (book.getYear() > year) {
                System.out.println(book);
            }
        }
        System.out.println();
    }
}