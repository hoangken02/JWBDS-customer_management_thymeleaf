package com.kenit.customermanagementthymeleaf.service;

import com.kenit.customermanagementthymeleaf.model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> findAll();

    void save(Customer customer);

    Customer findByID(int id);

    void update(int id, Customer customer);

    void delete(int id);
}
