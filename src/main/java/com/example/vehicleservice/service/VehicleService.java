package com.example.vehicleservice.service;

import com.example.vehicleservice.model.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle saveVehicle(Vehicle vehicle);
    List<Vehicle> findAllVehicles();
    Vehicle findVehicleById(Long id);
    List<Vehicle> findVehicleByServiceYear(int serviceYear);
    String findVehicleTypeByServiceId(Long serviceId);
    void deleteByServiceYear(int serviceYear);
}
