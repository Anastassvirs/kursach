package org.example.Kursach.database.controllers;

import org.example.Kursach.database.entity.Customer;
import org.example.Kursach.database.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/customer")
@RestController
public class CustomerAPIController {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerAPIController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public Iterable<Customer> getCustomers() {
        Iterable<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @PutMapping("/{id}/{login}")
    public Customer changeLogin (@PathVariable Integer id, @PathVariable String login) {
        Customer customer = customerRepository.findById(id).get();
        customer.setLogin(login);
        return customerRepository.save(customer);
    }ls

    @DeleteMapping("/{login}/delete")
    void deleteCustomer (@PathVariable String login) {
        customerRepository.deleteByLogin(login);
    }
}
