package org.example.Kursach.database.services;

import org.example.Kursach.database.entity.Book;
import org.example.Kursach.database.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    public Book findById(int id) {
        return bookRepository.findById(id);
    }

    public Page<Book> findByType(String type, Pageable pageable) {
        return bookRepository.findAllByType(type, pageable);
    }
}