package org.example.Kursach.database.repository;

import com.sun.istack.NotNull;
import org.example.Kursach.database.entity.Author;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

    @Transactional
    void deleteByLogin(@NotNull String login);
}
