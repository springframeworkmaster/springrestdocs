package com.tasks.app.restdocs.web.mappers;

import org.mapstruct.Mapper;

import com.tasks.app.restdocs.domain.Customer;
import com.tasks.app.restdocs.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
