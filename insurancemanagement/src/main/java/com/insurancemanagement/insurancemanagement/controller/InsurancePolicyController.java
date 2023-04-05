package com.insurancemanagement.insurancemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurancemanagement.insurancemanagement.model.InsurancePolicy;
import com.insurancemanagement.insurancemanagement.service.InsurancePolicyService;

@RestController
@RequestMapping("/api")
public class InsurancePolicyController {
    @Autowired
    private InsurancePolicyService insurancePolicyService;

    @GetMapping("/policies")
    public List<InsurancePolicy> getPolicies() {
        return insurancePolicyService.getPolicies();
    }

    @GetMapping("/policies/{id}")
    public InsurancePolicy getPolicy(@PathVariable Long id) {
        return insurancePolicyService.getPolicy(id);
    }

    @PostMapping("/policies")
    public InsurancePolicy createPolicy(@RequestBody InsurancePolicy insurancePolicy) {
        return insurancePolicyService.createPolicy(insurancePolicy);
    }

    @PutMapping("/policies/{id}")
    public InsurancePolicy updatePolicy(@PathVariable Long id, @RequestBody InsurancePolicy insurancePolicy) {
        return insurancePolicyService.updatePolicy(id, insurancePolicy);
    }

    @DeleteMapping("/policies/{id}")
    public void deletePolicy(@PathVariable Long id) {
        insurancePolicyService.deletePolicy(id);
    }
}
