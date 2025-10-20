package com.example.vehicleservice.repository;

import com.example.vehicleservice.model.Vehicle;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    List<Vehicle> findByServiceYear(int serviceYear);
    @Query("SELECT v.vehicleType FROM Vehicle v WHERE v.serviceId = :serviceId")
    String findVehicleTypeByServiceId(Long serviceId);
    @Transactional
    void deleteByServiceYear(int serviceYear);
}

