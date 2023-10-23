package com.example.concessionaria.car;

import jakarta.persistence.GenerationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
