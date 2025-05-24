package com.andre.graphql.services;

import com.andre.graphql.entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
  private final List<Book> books = new ArrayList<>();

  public BookService() {
    final Book b = new Book();
    b.setTitle("test");
    b.setDescription("test");
    books.add(b);
  }

  public List<Book> findAll() {
    return books;
  }
}
