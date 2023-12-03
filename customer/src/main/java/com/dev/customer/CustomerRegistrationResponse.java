package com.dev.customer;

public record CustomerRegistrationResponse(
        int customerId,
        String firstName,
        String lastName,
        String email,
        boolean isFraud
) {
}
