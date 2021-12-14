package com.homework.daniel;

import com.homework.daniel.Model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book[] books = {
                new Book("Harry potter", 20),
                new Book("The alchemist", 30),
                new Book("Effective Java", 70)
        };

        int[] stock = {3, 2, 10};

        System.out.println(booksArrayList(books, stock));
    }

    public static List<Book> booksArrayList(Book[] books, int[] stock) {
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            System.out.println("amount of "+ books[i].getTitle()+ " is : "+stock[i]);
                bookList.add(books[i]) ;
        }
        return bookList;
    }

}
