package org.example.Kursach.database.repository;

import com.sun.istack.NotNull;
import org.example.Kursach.database.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    @Transactional
    void deleteByLogin(@NotNull String login);
}
