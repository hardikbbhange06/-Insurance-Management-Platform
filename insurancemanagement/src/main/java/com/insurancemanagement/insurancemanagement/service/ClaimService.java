package com.insurancemanagement.insurancemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurancemanagement.insurancemanagement.model.Claim;
import com.insurancemanagement.insurancemanagement.repository.ClaimRepository;


@Service
public class ClaimService {
    @Autowired
    private ClaimRepository claimRepository;

    public List<Claim> getClaims() {
        return claimRepository.findAll();
    }

    public Claim getClaim(Long id) {
        return claimRepository.findById(id).orElse(null);
    }
}
