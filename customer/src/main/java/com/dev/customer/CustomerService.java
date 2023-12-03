package com.dev.customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;
    @Transactional
    public CustomerRegistrationResponse registerUser(CustomerRegistrationRequest registrationRequest) {
        log.info("registering new Customer");
        var customer =Customer.builder()
                .firstName(registrationRequest.getFirstName())
                .lastName(registrationRequest.getLastName())
                .email(registrationRequest.getEmail())
                .build();
        this.customerRepository.saveAndFlush(customer);
        FraudCheckResponse fraudResponse = this.restTemplate.getForObject(
                "http://localhost:8090/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId());
        assert fraudResponse != null;
        return new CustomerRegistrationResponse(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                fraudResponse.isFraudulent()
        );
    }
}
