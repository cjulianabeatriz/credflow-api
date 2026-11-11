
package br.com.credflow.controller;

import br.com.credflow.model.Customer;
import br.com.credflow.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer create(@Valid @RequestBody Customer customer) {
        return customerService.create(customer);
    }
}
