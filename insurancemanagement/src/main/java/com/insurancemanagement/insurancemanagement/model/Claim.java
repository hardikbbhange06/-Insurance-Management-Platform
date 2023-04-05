package com.insurancemanagement.insurancemanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String claimNumber;
    private String description;
    private String claimDate;
    private String claimStatus;
 
    @ManyToOne
    private InsurancePolicy insurancePolicy;
 
    // getters and setters
    // ...
}
