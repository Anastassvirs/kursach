package org.example.Kursach.database.controllers;

import org.example.Kursach.database.entity.Author;
import org.example.Kursach.database.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/author")
@RestController
public class AuthorAPIController {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorAPIController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public Iterable<Author> getAuthors() {
        Iterable<Author> authors = authorRepository.findAll();
        return authors;
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @PutMapping("/{id}/{login}")
    public Author changeLogin (@PathVariable Integer id, @PathVariable String login) {
        Author author = authorRepository.findById(id).get();
        author.setLogin(login);
        return authorRepository.save(author);
    }

    @DeleteMapping("/{login}/delete")
    void deleteAuthor (@PathVariable String login) {
        authorRepository.deleteByLogin(login);
    }
}
