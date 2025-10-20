package com.example.vehicleservice.repository;

import com.example.vehicleservice.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    List<Vehicle> findByServiceYear(int serviceYear);
    String findVehicleTypeByServiceId(Long serviceId);
    void deleteByServiceYear(int serviceYear);
}

