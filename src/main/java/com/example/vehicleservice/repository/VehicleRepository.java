package com.example.vehicleservice.repository;

import com.example.vehicleservice.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    List<Vehicle> findByServiceYear(int serviceYear);

    List<Vehicle> findVehicleTypeByServiceId(Long serviceId);
    List<Vehicle> deleteServiceYear(int serviceYear);
}

