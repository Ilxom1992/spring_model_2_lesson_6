package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String street;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private  Person person;

    public Address(String city, String street, Person person) {
        this.city = city;
        this.street = street;
        this.person = person;
    }
}
