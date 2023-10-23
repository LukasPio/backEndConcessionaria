package com.example.concessionaria.car;

public record CarResponseDTO(Long id, String title, String image, Integer price) {
    public CarResponseDTO (Car car){
        this(car.getId(), car.getTitle(), car.getImage(), car.getPrice());
    }
}
