package org.example.Kursach.database.controllers;

import org.example.Kursach.database.entity.Genre;
import org.example.Kursach.database.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/genre")
@RestController
public class GenreAPIController {

    private final GenreRepository genreRepository;

    @Autowired
    public GenreAPIController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @GetMapping
    public Iterable<Genre> getAuthors() {
        Iterable<Genre> genres = genreRepository.findAll();
        return genres;
    }

    @PostMapping
    public Genre createGenre(@RequestBody Genre genre) {
        return genreRepository.save(genre);
    }

    @PutMapping("/{id}/{name}")
    public Genre changeName (@PathVariable Integer id, @PathVariable String name) {
        Genre genre = genreRepository.findById(id).get();
        genre.setName(name);
        return genreRepository.save(genre);
    }

    @DeleteMapping("/{id}/delete")
    void deleteGenre (@PathVariable int id) {
        genreRepository.deleteById(id);
    }
}
