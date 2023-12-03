package com.dev;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {

    private final FraudService fraudService;

    @GetMapping("{customerId}")
    public FraudCheckResponse isFraud(@PathVariable Integer customerId){
        boolean isfraud = this.fraudService.isFraudulentCustomer(customerId);
        return new FraudCheckResponse(isfraud);
    }

}
