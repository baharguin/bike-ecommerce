package com.example.PublishingService.repositories;

import com.example.PublishingService.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Long> {

}
