
package br.com.credflow.service;

import br.com.credflow.model.Customer;
import br.com.credflow.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer create(Customer customer) {
        if (customerRepository.existsByCpf(customer.getCpf())){
            throw new IllegalArgumentException("Já existe um cliente cadastrado com este CPF");
        }
        return customerRepository.save(customer);
    }
}
