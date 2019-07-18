package com.tasks.app.restdocs.services;

import java.util.UUID;

import com.tasks.app.restdocs.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
