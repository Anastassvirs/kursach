package org.example.Kursach.database.repository;

import com.sun.istack.NotNull;
import org.example.Kursach.database.entity.Book;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface BookRepository extends CrudRepository<Book, Integer> {

    @Transactional
    void deleteByName(@NotNull String name);
}