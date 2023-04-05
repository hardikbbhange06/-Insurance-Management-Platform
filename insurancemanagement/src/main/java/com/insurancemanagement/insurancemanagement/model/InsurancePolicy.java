package com.insurancemanagement.insurancemanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class InsurancePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String policyNumber;
    private String type;
    private Integer coverageAmount;
    private Integer premium;
    private String startDate;
    private String endDate;
 
    @ManyToOne
    private Client client;

	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
 
    // getters and setters
    // ...
}
