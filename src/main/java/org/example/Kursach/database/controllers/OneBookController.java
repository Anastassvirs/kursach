package org.example.Kursach.database.controllers;

import org.example.Kursach.database.entity.Book;
import org.example.Kursach.database.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OneBookController {
    private final BookService bookService;

    @Autowired
    public OneBookController (
            BookService bookService
    ) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}/catalogProduct")
    public ModelAndView ShowFirstPage(@PathVariable int id){
        Book book = bookService.findById(id);
        return new ModelAndView("catalogProduct").addObject("book", book);
    }
}
