package com.insurancemanagement.insurancemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurancemanagement.insurancemanagement.model.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {

}
