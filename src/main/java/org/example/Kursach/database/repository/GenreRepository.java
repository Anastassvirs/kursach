package org.example.Kursach.database.repository;

import com.sun.istack.NotNull;
import org.example.Kursach.database.entity.Genre;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface GenreRepository extends CrudRepository<Genre, Integer> {

    @Transactional
    void deleteById(@NotNull int id);
}