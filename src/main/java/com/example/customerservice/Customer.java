package com.example.customerservice;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phone;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private CustomerContactDetails contactDetails;
}
