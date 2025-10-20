package com.example.vehicleservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "serviceId",nullable = false)
    private Long serviceId;
    @Column(name="vehicleType",nullable=false)
    private String vehicleType;
    @Column(name = "vehicleNumber",nullable=false)
    private String vehicleNumber;
    @Column(name = "serviceYear", nullable=false)
    private int serviceYear;
    @Column(name = "serviceDetails", nullable=false)
    private String serviceDetails;

}
