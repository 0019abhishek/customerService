package com.example.customerservice;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_contact_details")
public class CustomerContactDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id", unique = true)
    private Customer customer;

    private String aadhar;
    private String pan;
    private String voterId;

    private String addressLine1;
    private String addressLine2;
    private String landmark;
    private String city;
    private String state;
    private String pincode;
}
