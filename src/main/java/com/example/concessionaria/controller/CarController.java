package com.example.concessionaria.controller;

import com.example.concessionaria.car.Car;
import com.example.concessionaria.car.CarRepository;
import com.example.concessionaria.car.CarRequestDTO;
import com.example.concessionaria.car.CarResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {
    @Autowired
    private CarRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveCar(@RequestBody CarRequestDTO data) {
        Car car = new Car(data);
        repository.save(car);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<CarResponseDTO> getAll() {

        List<CarResponseDTO> carList = repository.findAll().stream().map(CarResponseDTO::new).toList();
        return carList;

    }
}
