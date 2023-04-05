package com.insurancemanagement.insurancemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurancemanagement.insurancemanagement.model.InsurancePolicy;
import com.insurancemanagement.insurancemanagement.repository.InsurancePolicyRepository;


@Service
public class InsurancePolicyService {
    @Autowired
    private InsurancePolicyRepository insurancePolicyRepository;

    public List<InsurancePolicy> getPolicies() {
        return insurancePolicyRepository.findAll();
    }

    public InsurancePolicy getPolicy(Long id) {
        return insurancePolicyRepository.findById(id).orElse(null);
    }

    public InsurancePolicy createPolicy(InsurancePolicy insurancePolicy) {
        return insurancePolicyRepository.save(insurancePolicy);
    }

    public InsurancePolicy updatePolicy(Long id, InsurancePolicy insurancePolicy) {
        insurancePolicy.setId(id);
        return insurancePolicyRepository.save(insurancePolicy);
    }

    public void deletePolicy(Long id) {
        insurancePolicyRepository.deleteById(id);
    }
}