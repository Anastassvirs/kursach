package org.example.Kursach.database.controllers;

import org.example.Kursach.database.entity.Book;
import org.example.Kursach.database.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/book")
@RestController
public class BookAPIController {

    private final BookRepository bookRepository;

    @Autowired
    public BookAPIController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public Iterable<Book> getBooks() {
        Iterable<Book> books = bookRepository.findAll();
        return books;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping("/{id}/{name}/{description}")
    public Book changeNameAndDesc (@PathVariable Integer id, @PathVariable String name, @PathVariable String description) {
        Book book = bookRepository.findById(id).get();
        book.setName(name);
        book.setDescription(description);
        return bookRepository.save(book);
    }

    @DeleteMapping("/{name}/delete")
    void deleteBook (@PathVariable String name) {
        bookRepository.deleteByName(name);
    }
}
