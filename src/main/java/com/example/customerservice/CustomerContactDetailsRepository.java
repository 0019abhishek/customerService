package com.example.customerservice;


import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerContactDetailsRepository extends JpaRepository<CustomerContactDetails, Long> {
}