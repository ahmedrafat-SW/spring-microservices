package com.dev;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class FraudCheckHistory {

    @Id
    @SequenceGenerator(name = "fraud_seq", sequenceName = "fraud_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fraud_seq")
    private Integer id;
    private Integer customerId;
    private Boolean isFraud;
    private LocalDateTime createdAt;
}
