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

import com.insurancemanagement.insurancemanagement.model.Claim;
import com.insurancemanagement.insurancemanagement.service.ClaimService;


@RestController
@RequestMapping("/api")
public class ClaimController {
    @Autowired
    private ClaimService claimService;

    @GetMapping("/claims")
    public List<Claim> getClaims() {
        return claimService.getClaims();
    }

    @GetMapping("/claims/{id}")
    public Claim getClaim(@PathVariable Long id) {
        return claimService.getClaim(id);
    }

//    @PostMapping("/claims")
//    public Claim createClaim(@RequestBody Claim claim) {
//        return claimService.createClaim(claim);
//    }

//    @PutMapping("/claims/{id}")
//    public Claim updateClaim(@PathVariable Long id, @RequestBody Claim claim) {
//        return claimService.updateClaim(id, claim);
//    }

//    @DeleteMapping("/claims/{id}")
//    public void deleteClaim(@PathVariable Long id) {
//        claimService.deleteClaim(id);
//    }
}