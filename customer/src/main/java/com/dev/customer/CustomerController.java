package com.dev.customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> registerUser(@RequestBody CustomerRegistrationRequest registrationRequest){
        log.info("Added new customer");
        CustomerRegistrationResponse customer = this.customerService.registerUser(registrationRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }




}
