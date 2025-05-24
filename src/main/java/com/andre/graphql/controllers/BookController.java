package com.andre.graphql.controllers;

import com.andre.graphql.entities.Book;
import com.andre.graphql.services.BookService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @QueryMapping
    public List<Book> findAllBooks() {
        return bookService.findAll();
    }
}
