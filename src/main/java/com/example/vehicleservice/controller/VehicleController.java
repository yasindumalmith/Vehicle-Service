package com.example.vehicleservice.controller;

import com.example.vehicleservice.model.Vehicle;
import com.example.vehicleservice.repository.VehicleRepository;
import com.example.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin(origins = "*")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;
    @PostMapping
    public ResponseEntity<Vehicle> saveVehicle(@RequestBody Vehicle vehicle) {
        return new ResponseEntity<>(vehicleService.saveVehicle(vehicle), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Vehicle> findAllVehicles(){
        return vehicleService.findAllVehicles();
    }
    @GetMapping("{id}")
    public ResponseEntity<Vehicle> findVehicleById(@PathVariable("id") Long id){
        return new ResponseEntity<Vehicle>(vehicleService.findVehicleById(id), HttpStatus.OK);
    }
    @GetMapping("/year/{year}")
    public ResponseEntity<List<Vehicle>> findVehiclesByServiceYear(@PathVariable("year") int serviceYear){
        return new ResponseEntity<>(vehicleService.findVehicleByServiceYear(serviceYear),HttpStatus.OK);
    }
    @GetMapping("/type/{id}")
    public String findVehicleTypeById(@PathVariable("id") Long id){
        return vehicleService.findVehicleTypeByServiceId(id);
    }
    @DeleteMapping("/year/{year}")
    public ResponseEntity<Vehicle> deleteVehicleById(@PathVariable("year") int year){
        vehicleService.deleteByServiceYear(year);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
