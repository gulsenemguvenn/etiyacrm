package com.etiyacrm.customerservice.entities;


import com.etiyacrm.customerservice.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "addresses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address extends BaseEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="description")
    private String description;

    @Column(name = "district")
    private String district;

    @Column(name = "street")
    private String street;

    @Column(name = "flatNumber")
    private int flatNumber;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;
}