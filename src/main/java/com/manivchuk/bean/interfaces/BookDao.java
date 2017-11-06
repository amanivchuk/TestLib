package com.manivchuk.bean.interfaces;

import com.manivchuk.entities.Author;
import com.manivchuk.entities.Book;
import com.manivchuk.entities.Genre;

import java.util.List;

/**
 * Created by nec on 02.11.17.
 */
public interface BookDao {
    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);

}
