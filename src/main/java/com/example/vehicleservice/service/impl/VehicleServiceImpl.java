package com.example.vehicleservice.service.impl;

import com.example.vehicleservice.model.Vehicle;
import com.example.vehicleservice.repository.VehicleRepository;
import com.example.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
    @Override
    public List<Vehicle> findAllVehicles() {
        return vehicleRepository.findAll();
    }
    @Override
    public Vehicle findVehicleById(Long vehicleId) {
        return vehicleRepository.findById(vehicleId).orElse(null);
    }
    @Override
    public List<Vehicle> findVehicleByServiceYear(int serviceYear) {
        return vehicleRepository.findByServiceYear(serviceYear);
    }
    @Override
    public String findVehicleTypeByServiceId(Long serviceId) {
        return vehicleRepository.findVehicleTypeByServiceId(serviceId);
    }
    @Override
    public void deleteByServiceYear(int serviceYear) {
        vehicleRepository.deleteByServiceYear(serviceYear);
    }



}
