package org.example.Kursach.database.controllers;

import org.example.Kursach.database.entity.Book;
import org.example.Kursach.database.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(
            BookService bookService
    ) {
        this.bookService = bookService;
    }

    @GetMapping("/catalog")
    public ModelAndView ShowFirstPage(
            Pageable pageable
    ){
        Page<Book> bookObject = bookService.findAll(pageable);

        return new ModelAndView("/bookscatalog")
                .addObject("books", bookObject);
    }
}